package com.school_phonedataplan;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Inserisci il nome del telefono: ");

        Telefono telefono = new Telefono(scan.nextLine());

        telefono.ricarica();

        telefono.telefonata(); // Spento

        telefono.cambiaStato();

        telefono.telefonata(); // chiama

        telefono.connessione(); // consuma

        telefono.setCredito(0);

        telefono.connessione();

        telefono.ricarica();

        telefono.connessione();

        telefono.stampa();

    }
}
