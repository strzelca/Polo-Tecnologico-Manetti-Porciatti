package com.school_orologio;

/*
    Descrivere la classe orologio che registra le ore e i minuti
    Definire 3 costruttori:
    1. Inizializzare l'orologio ad un ora di default (es. 00:00)
    2. Inizializzare solo le ore
    3. Inizializzare sia le ore sia i minuti

    Inizializzare i metodi get e set, il metodo stampa

    Fare un menù
    1. inizializza le ore al default
    2. Inizializza solo le ore
    3. Inizializza sia le ore che i minuti
    4. Fine
*/

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        String os = System.getProperty("os.name");
        Orologio orologio = null;

        boolean execute = true;
        byte select;

        while(execute) {
            System.out.println("Scegli una opzione");
            System.out.println(
                    "\t1. Inizializza le ore al default\n" +
                    "\t2. Inizializza solo le ore\n" +
                    "\t3. Inizializza sia le ore che i minuti\n" +
                    "\t4. Stampa\n" +
                    "\t5. Fine\n");
            System.out.print("> ");
            select = scan.nextByte();

            switch (select) {
                case 1:
                    orologio = new Orologio(0, 0);
                    break;
                case 2:
                    System.out.println("Inizializza l'orologio inserendo l'ora");
                    orologio = new Orologio(scan.nextInt(), 0);
                    break;
                case 3:
                    System.out.println("Inizializza l'orologio inserendo l'ora e i minuti");
                    orologio = new Orologio(scan.nextInt(), scan.nextInt());
                    break;
                case 4:
                    if(orologio == null) {
                        System.out.println("Orologio non inizializzato");
                    } else {
                        orologio.stampa();
                    }
                    break;
                case 5:
                    execute=!execute;
                    break;
            }

        }
    }
}
