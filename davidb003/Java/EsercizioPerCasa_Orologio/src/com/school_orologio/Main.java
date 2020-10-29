package com.school_orologio;

/*
    Descrivere la classe orologio che registra le ore e i minuti
    Definire 3 costruttori:
    1. Inizializzare l'orologio ad un ora di default (es. 00:00)
    2. Inizializzare solo le ore
    3. Inizializzare sia le ore sia i minuti
    4. Inserire da tastiera un incremento ore, aggiornare le ore, controllando però,
       che la somma delle ore precedenti più le nuove ore non superi le ore 24

    Inizializzare i metodi get e set, il metodo stampa

    Fare un menù
    1. inizializza le ore al default
    2. Inizializza solo le ore
    3. Inizializza sia le ore che i minuti
    4. Fine
*/

import java.util.Scanner; // 1. Importare lo scanner

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // 2. Dichiarare lo scanner
        Orologio orologio = null;

        boolean execute = true;
        byte select;
        byte inputIncremento;

        while(execute) {
            System.out.println("Scegli una opzione");
            System.out.println(
                    "\t1. Inizializza le ore al default\n" +
                    "\t2. Inizializza solo le ore\n" +
                    "\t3. Inizializza sia le ore che i minuti\n" +
                    "\t4. Stampa\n" + "\t5. Incremento Orario\n" +
                    "\t6. Fine\n");
            System.out.print("> ");
            select = scan.nextByte(); // 3. Utilizzare lo scanner

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
                    System.out.println("\nInserisci incremento ore: ");
                    inputIncremento = scan.nextByte();
                    orologio.incrementoOre(inputIncremento);
                    break;
                case 6:
                    execute=!execute;
                    break;
                default:
                    throw new IllegalStateException("Il tasto selezionato non è valido: " + select);
            }

        }
    }
}
