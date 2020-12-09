package com.school_docente;

public class Main {

    public static void main(String[] args) {
	    Docente docente = new Docente("Flavio", "Rosso", "Educazione Civica",
                1000);

	    Docente docente_nopar = new Docente();

	    docente_nopar.setNome("Mario");
	    docente_nopar.setCognome("Rossi");
	    docente_nopar.setMateriaDiInsegnamento("Storia");
	    docente_nopar.setStipendio(800);

        docente.print();
        docente_nopar.print();


    }
}
