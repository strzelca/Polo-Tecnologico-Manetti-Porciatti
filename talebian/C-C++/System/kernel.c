#include "keyboard_map.h"

#define KBADDR 0x21
#define PIC1CMD 0x20
#define PIC1DAT 0x21
#define PIC2CMD 0xA0
#define PIC2DAT 0xA1

#define LINES 25
#define COLUMNS_IN_LINE 80
#define BYTES_FOR_EACH_ELEMENT 2
#define SCREENSIZE BYTES_FOR_EACH_ELEMENT * COLUMNS_IN_LINE * LINES

#define KEYBOARD_DATA_PORT 0x60
#define KEYBOARD_STATUS_PORT 0x64
#define IDT_SIZE 256
#define INTERRUPT_GATE 0x8e
#define KERNEL_CODE_SEGMENT_OFFSET 0x08

#define ENTER_KEY_CODE 0x1C

/*
    0xfffffff0 last 16 bytes of 32bit address space -> Reset Vector
    BIOS copies itself in RAM
    0xfffffff0 contains jump to BIOS address in memory

    BIOS execution starts:

    BIOS searches for a bootable device in configured boot order
        if disk is bootable bytes 511 or 512 of first sectore are 0xAA55

    next it copies the content of first sector in RAM at address 0x7C00 and
    jumps into it.
    The code executed is the bootloader.

    Bootloader loads kernel at physical address 0x100000.

    x86 begin in 16bit mode -> Real Mode
    Bootloader swtich to 32bit by setting lowst bit of CR0 register to 1 -> Protected Mode

    The kernel loads in 32bit Protected Mode

    In case of Linux, GRUB executes it in real mode and Linux itself makes the switch to
    protected mode


*/

extern unsigned char keyboard_map[128];
extern void keyboard_handler(void);
extern char read_port(unsigned short port);
extern void write_port(unsigned short port, unsigned char data);
extern void load_idt(unsigned long *idt_ptr);

unsigned int flag = 1;
unsigned int current_loc = 0;

char *  videomem = (char*)0xb8000;

struct IDT_entry {
    unsigned short int offset_lowerbits;
    unsigned short int selector;
    unsigned char zero;
    unsigned char type_attr;
    unsigned short int offset_higherbits;
};

struct IDT_entry IDT[IDT_SIZE];


void idt_init(void) {
    unsigned long kb_addr;
    unsigned long idt_addr;
    unsigned long idt_ptr[2];

    kb_addr = (unsigned long)keyboard_handler;
    IDT[KBADDR].offset_lowerbits = kb_addr & 0xffff;
    IDT[KBADDR].selector = KERNEL_CODE_SEGMENT_OFFSET; // KERNEL_CODE_SEGMENT_OFFSET
    IDT[KBADDR].zero = 0;
    IDT[KBADDR].type_attr = INTERRUPT_GATE; // INTERRUPT_GATE
    IDT[KBADDR].offset_higherbits = (kb_addr & 0xffff0000) >> 16;

    /*
              PORTS
                PIC1  PIC2
        Command 0x20  0xA0
        Data    0x21  0xA1
     */

    // ICW1 - begin initialization
    write_port(PIC1CMD , 0x11);
    write_port(PIC2CMD , 0x11);

    // ICW2 - remap offset address of IDT
    write_port(PIC1DAT , 0x20);
    write_port(PIC2DAT , 0x28);

    // ICW3 - setup cascading
    write_port(PIC1DAT , 0x00);
    write_port(PIC2DAT , 0x00);

    // ICW4 - environment info
    write_port(PIC1DAT , 0x01);
    write_port(PIC2DAT , 0x01);
    // Initialization finished

    // mask interrupts */
    write_port(PIC1DAT , 0xff);
    write_port(PIC2DAT , 0xff);

    idt_addr = (unsigned long)IDT;
    idt_ptr[0] = (sizeof(struct IDT_entry) * IDT_SIZE) + ((idt_addr & 0xffff) << 16);
    idt_ptr[1] = idt_addr >> 16;

    load_idt(idt_ptr);
}

void kb_init(void) {
    // 0xFD is 11111101 - enables only IRQ1 (keyboard)
    write_port(0x21 , 0xFD);
}

void kprint(const char *str) {
    unsigned i = 0;
    while (str[i] != '\0') {
        videomem[current_loc++] = str[i++];
        videomem[current_loc++] = 0x07;
    }
}

void kprint_newline(void) {
    unsigned int line_size = BYTES_FOR_EACH_ELEMENT * COLUMNS_IN_LINE;
    current_loc = current_loc + (line_size - current_loc % (line_size));
}

void clear_screen(void) {
    unsigned int i = 0;
    while (i < SCREENSIZE) {
        videomem[i++] = ' ';
        videomem[i++] = 0x07;
    }
}

void keyboard_handler_main(void) {
    unsigned char status;
    char keycode;

    write_port(0x20, 0x20);

    status = read_port(KEYBOARD_STATUS_PORT);

    if(status & 0x01) {
        keycode = read_port(KEYBOARD_DATA_PORT);
        if(keycode < 0)
            return;
        if(keycode == ENTER_KEY_CODE) {
            kprint_newline();
            return;
        }
        if(keycode == 27){
            clear_screen();
            return;
        }

        videomem[current_loc++] = keyboard_map[(unsigned char)keycode];
        videomem[current_loc++] = 0x07;
    }
}

void kmain(void) {

    const char *str = "Sovetskaya Narodnaya Kernel";

    clear_screen();
    kprint(str);
    kprint_newline();
    kprint_newline();

    idt_init();
    kb_init();

    while(flag);
}