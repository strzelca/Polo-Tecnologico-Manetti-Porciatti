package com.school_studente_v2;

// TODO realizzare un menu con le seguenti opzioni:
// TODO 1..aggiungi voto;
// TODO 2..modifica classe alunno;
// TODO 3.. esito alunno;
// TODO 4.. media degli alunni;
// TODO 5.. fine

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

        boolean execute = true;
        byte select;
        byte inputIncremento;

        while (execute) {
            System.out.println("\n-------------------------------\n");
            System.out.println("Scegli una opzione");
            System.out.println("");
            System.out.print("> ");
            select = scan.nextByte();

            switch (select) {
                case 1:
    }
}
