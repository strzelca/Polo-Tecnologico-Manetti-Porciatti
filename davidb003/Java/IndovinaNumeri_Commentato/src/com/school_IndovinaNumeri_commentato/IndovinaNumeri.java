package com.school_IndovinaNumeri_commentato;

import java.io.*;

public class IndovinaNumeri {
    public static void main(String[] a) {
        System.out.println("inizio gioco"); // print
        do { // Do statement
            System.out.println("Io ho pensato un numero tra 1 e 9."
                    + "\nHai tre tentativi per scoprirlo"); // Print
            int numeroPensato = (int)(Math.random()*9 + 1); // Genera numero random e calcola *9 +1
            eseguiGioco(numeroPensato);  // chiamata del metodo eseguiGioco(),
            // definito in seguito.
            System.out.println("Vuoi giocare ancora (S/N)? ");
            String risposta = "";
            BufferedReader console = new BufferedReader( // Legge il buffer
                    new InputStreamReader(System.in));
            try { // Prova ad eseguire
                risposta = console.readLine();
            }
            catch (IOException e) { // Cattura gli errori
                System.out.println("Errore di input");
                System.exit(1); // Esce con stato 1
            }
            if (risposta.equalsIgnoreCase("n"))
                break;
            // se l'utente risponde in qq modo che non sia "n" o "N",
            // la risposta viene considerata come un "si".
        } while (true);
        System.out.println("Fine Gioco. Ciao!");
    }  // fine main
    public static void eseguiGioco(int numPensato) {
        BufferedReader datiUtente = new BufferedReader( // Input
                new InputStreamReader(System.in));
        int rispUtente = 0;
        boolean vinto = false;
        for (int i = 0; i < 3; i++) { // Ciclo for
            System.out.println("Tentativo numero " +
                    (i+1));
            try {
                String risp = datiUtente.readLine();
                rispUtente = Integer.parseInt(risp);
            }
            catch (IOException e) {
                System.out.println("Errore di input");
                System.exit(1);
            }
            if (rispUtente == numPensato) { //Se vero, setta la variabile boolean a true
                vinto = true;
                break;
            }
            else { // Altrimenti
                System.out.println("tentativo sbagliato!");
            }
        }
        if (vinto)
            System.out.println("Hai vinto!");
        else
            System.out.println("Hai perso! Io avevo pensato il numero " + numPensato);
    }
}

