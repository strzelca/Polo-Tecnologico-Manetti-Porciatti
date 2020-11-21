package com.school_studente_v2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    studente Studente = new studente("KLCFLR01P11Z104G", "Количков",
                "Флоро", "3Z");
	    Studente.aggiungiVoto(6F);
        Studente.stampa();
        Studente.esito();

        float inputVoto;

        Scanner scan = new Scanner(System.in);
        System.out.println("\nInserisci codice alunno: ");
        String inputCodiceAlunno = scan.nextLine();
        Studente.modificaClasse_CodiceAlunno(inputCodiceAlunno);

        System.out.println("\nInserisci Cognome: ");
        String inputCognome = scan.nextLine();
        Studente.modificaClasse_Cognome(inputCognome);

        System.out.println("Inserisci Nome: ");
        String inputNome = scan.nextLine();
        Studente.modificaClasse_Nome(inputNome);

        System.out.println("Inserisci Classe: ");
        String inputClasse = scan.nextLine();
        Studente.modificaClasse_Classe(inputClasse);

        System.out.println("Inserisci Voto: ");
        inputVoto = scan.nextFloat();
        Studente.modificaClasse_Voto(inputVoto);

        Studente.stampa();
        Studente.esito();
    }
}
