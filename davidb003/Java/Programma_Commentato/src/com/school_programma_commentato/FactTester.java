package com.school_programma_commentato;

import java.util.Scanner;

public class FactTester {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Input da tastiera
        int a = in.nextInt(); // Richiede l'inout all'utente
        Fact n = new Fact(a); // Utilizza il costruttore
        System.out.println(n.conv()); // Stampa a schermo i dati
    }
}
