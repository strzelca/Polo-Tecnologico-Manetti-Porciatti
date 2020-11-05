package com.school_libro;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /* TODO 5. Gestire con menu le seguenti opzioni
        - Inserimento dati del libri
                - Modifica del titolo del libro (input da tastiera)
        - Visualizzazione dell'autore del libro
                - Stampa di tutte le informazioni del libro
        - Modifica del prezzo del libro
        - Fine
         */

        Scanner scan = new Scanner(System.in);
        Libro libro = new Libro();

        boolean execute = true;
        byte select;

        String inputTitolo;
        String inputAutore;
        float inputPrezzo;
        String inputCasaEditrice;

        String inputNuovoNome;

        float inputNuovoPrezzo;

        while (execute) {
            System.out.println("Scegli un opzione");
            System.out.println("\n1. Inserisci i dati del libro" +
                    "\n2. Modifica Titolo" +
                    "\n3. Visualizza Autore" +
                    "\n4. Informazioni Libro" +
                    "\n5. Modifica Prezzo" +
                    "\n6. Esci\n");
            System.out.print("> ");
            select = scan.nextByte();

            switch (select) {
                case 1:
                    System.out.println("\n\n===== INSERIMENTO DATI LIBRO ======\n" +
                            "Titolo: ");
                    inputTitolo = scan.nextLine();
                    System.out.println("\nAutore: ");
                    inputAutore = scan.nextLine();
                    System.out.println("\nPrezzo: €");
                    inputPrezzo = scan.nextFloat();
                    System.out.println("\nCasa Editrice: ");
                    inputCasaEditrice = scan.nextLine();

                    libro.setTitolo(inputTitolo);
                    libro.setAutore(inputAutore);
                    libro.setPrezzo(inputPrezzo);
                    libro.setCasaEditrice(inputCasaEditrice);

                    System.out.println("\n==================================\n\n");
                    break;
                case 2:
                    System.out.println("\n\n===== MODIFICA NOME LIBRO =====\n" +
                            "Il nome corrente è: " + libro.getTitolo() + "\nInserisci il nuovo nome: ");
                    inputNuovoNome = scan.nextLine();

                    libro.setTitolo(inputNuovoNome);

                    System.out.println("\n\nIl nuovo nome è: " + libro.getTitolo());

                    System.out.println("\n==================================\n\n");
                    break;
                case 3:
                    System.out.println("\n\n===== VISUALIZZA AUTORE =====\n" +
                    "L'autore del libro " + libro.getTitolo() + " è " + libro.getAutore());

                    System.out.println("\n==================================\n\n");
                    break;
                case 4:
                    System.out.println("\n\n===== VISUALIZZA INFORMAZIONI LIBRO =====\n" +
                            "Titolo: " + libro.getTitolo() +
                            "\nAutore: " + libro.getAutore() +
                            "\nPrezzo: " + libro.getPrezzo() +
                            "\nCasa Editrice: " + libro.getCasaEditrice());

                    System.out.println("\n==================================\n\n");
                    break;
                case 5:
                    System.out.println("\n\n===== MODIFICA PREZZO =====\n" +
                            "Il prezzo corrente è: €" + libro.getPrezzo() + "\nInserisci il nuovo prezzo: €");
                    inputNuovoPrezzo = scan.nextFloat();
                    libro.setPrezzo(inputNuovoPrezzo);

                    System.out.println("\n\nIl nuovo prezzo è: " + libro.getPrezzo());

                    System.out.println("\n==================================\n\n");
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
