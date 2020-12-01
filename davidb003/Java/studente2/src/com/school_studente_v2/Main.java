package com.school_studente_v2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String inputCodiceAlunno,
               inputCognome,
               inputNome,
               inputClasse;

        float inputVoto;

	    Studente studente = new Studente("KLCFLR01P11Z104G", "Количков",
                "Флоро", "3Z");
	    studente.aggiungiVoto(6F);
        studente.stampa();
        studente.esito();

        Scanner scan = new Scanner(System.in);
        System.out.println("\nInserisci codice alunno: ");
        inputCodiceAlunno = scan.nextLine();

        System.out.println("\nInserisci Cognome: ");
        inputCognome = scan.nextLine();

        System.out.println("Inserisci Nome: ");
        inputNome = scan.nextLine();

        System.out.println("Inserisci Classe: ");
        inputClasse = scan.nextLine();

        System.out.println("Inserisci Voto: ");
        inputVoto = scan.nextFloat();

        studente.modificaClasse(inputCodiceAlunno, inputCognome, inputNome, inputClasse, inputVoto);

        studente.stampa();
        studente.esito();
    }
}
