package com.school_bevanda;

//DONE 1.aggiungi prezzo;
//DONE 2.incremento prezzo;
//DONE 3. stampa;
//DONE 4. gradoalcolico;
//DONE 5. fine

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Bevanda Bevanda = new Bevanda();
        Scanner scan = new Scanner(System.in);

        boolean execute = true;
        byte select;
        byte inputIncremento;

        while (execute) {
            System.out.println("\n-------------------------------\n");
            System.out.println("Scegli una opzione");
            System.out.println("1. Input dati\n2. Inserisci prezzo\n3. Incrementa prezzo del 10%" +
                    "\n4. Determina grado alcolico\n5. Stampa\n6. Esci");
            System.out.print("> ");
            select = scan.nextByte();

            switch (select) {
                case 1:
                    System.out.println("\nNome Bevanda: ");
                    Bevanda.setNome(scan.next());
                    System.out.println("\nGradazione: ");
                    Bevanda.setGradazione(scan.nextInt());

                    byte selectTipo;
                    System.out.println("\n\n1 = Calda\n2 = Fredda\n\n>");
                    selectTipo = scan.nextByte();
                    if (selectTipo == 1) {
                        Bevanda.setTrue();
                    }
                    if (selectTipo == 2) {
                        Bevanda.setFalse();
                    }
                    if (selectTipo > 2 && selectTipo < 0) {
                        throw new IllegalStateException("Selezione non valida");
                    }

                    System.out.println("\nPrezzo: ");
                    Bevanda.setPrezzo(scan.nextFloat());

                    break;
                case 2:
                    System.out.println("\nInserisci Prezzo: ");
                    Bevanda.aggiungiPrezzo(scan.nextFloat());
                    break;

                case 3:
                    Bevanda.modificaPrezzo();
                    System.out.println("Prezzo incrementato del 10%");
                    break;

                case 4:
                    Bevanda.gradoAlcolico();
                    break;
                case 5:
                    Bevanda.stampa();
                    break;
                case 6:
                    execute = !execute;
                    break;

                default:
                    throw new IllegalStateException("Il tasto selezionato non è valido: " + select);
            }
        }
    }
}
