
extern "C" void bmain() {
    const short color = 0x4E00;
    const char *str = "Hello World from cpp function";
    short *mem = (short*) 0xb8000;
    for (int i = 0; i<16; ++i){
        mem[i+80] = color | str[i];
    }
}

