package com.school_studente_v2;

public class Main {

    public static void main(String[] args) {
	    studente Studente = new studente("KLCFLR01P11Z104G", "Количков",
                "Флоро", "3Z");
	    Studente.aggiungiVoto(77F);
        Studente.stampa();
        Studente.esito();


    }
}
