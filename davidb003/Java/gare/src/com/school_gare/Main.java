package com.school_gare;

// TODO Creare un menù con le seguenti opzioni:
//- inserimento dati (quindi inserimento nome gara. tipo sport etc.)
//- inserire il nome del vincitore della gara
//- stampa
//- fine

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Gare gare = new Gare();

        boolean execute = true;
        byte select;

        while (execute) {
            System.out.println("Scegli un opzione");
            System.out.println("\n1. Inserimento dati" +
                    "\n2. Inserisci il nome del vincitore della gara" +
                    "\n3. Output" +
                    "\n4. Esci");
            System.out.println("> ");
            select = scan.nextByte();

            switch (select) {
                case 1:
                    System.out.println("\n\n===== INSERIMENTO DATI ======\n");
                    System.out.println("\nNome Gara: ");
                    scan.nextLine();
                    gare.setNomeGara(scan.nextLine());

                    System.out.println("\nTipo Sport: ");
                    gare.setTipoSport(scan.nextLine());

                    System.out.println("\nPremio In Denaro: ");
                    gare.setPremioInDenaro(scan.nextDouble());

                    System.out.println("\n==================================\n\n");
                    break;
                case 2:
                    System.out.println("\n\n===== INSERISCI VINCITORE GARA ======\n");
                    System.out.println("\nNome Vincitore: ");
                    scan.nextLine();
                    gare.setNomeVincitore(scan.nextLine());

                    System.out.println("\n==================================\n\n");
                    break;
                case 3:
                    System.out.println("\n\n===== OUTPUT ======\n");

                    System.out.println("\nNome Gara: " + gare.getNomeGara());
                    System.out.println("\nTipo Sport: " + gare.getTipoSport());
                    System.out.println("\nPremio In Denaro: " + gare.getPremioInDenaro() + "€");
                    System.out.println("\nNome Vincitore: " + gare.getNomeVincitore());

                    System.out.println("\n==================================\n\n");
                    break;
                case 4:
                    execute = !execute;
                    break;
                default:
                    throw new IllegalStateException("Il tasto selezionato non è valido: " + select);
            }
        }
    }
}
