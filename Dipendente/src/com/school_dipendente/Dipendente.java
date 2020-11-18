package com.school_dipendente;

// TODO Creare la Classe Dipendente con: attributi Nome,
// TODO Cognome, Mansione, Stipendio, il metodo Costruttore e
// TODO metodi necessari per gestire il programma.

public class Dipendente {
    public static String nome;
    public static String cognome;
    public static String mansione;
    private static float stipendio;

    public Dipendente(String nome, String cognome, String mansione, float stipendio) {
        this.nome = nome;
        this.cognome = cognome;
        this.mansione = mansione;
    }

    public static float getStipendio() {
        return stipendio;
    }

    public static void setStipendio(float stipendio) {
        Dipendente.stipendio = stipendio;
    }
}
