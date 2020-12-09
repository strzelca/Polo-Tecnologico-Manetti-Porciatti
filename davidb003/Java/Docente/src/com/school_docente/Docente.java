// DONE Progettare e realizzare la classe Docente.
//  Ciascun docente ha un nome (di tipo stringa), un cognome (di tipo stringa)
//  una materia di insegnamento (di tipo stringa)
//  e percepisce uno stipendi (di tipo double).

// TODO Scrivere un costruttore senza parametri
//  un costruttore con tre parametri (nome, cognome e stipendio)
//  e i metodi per conoscere nome, cognome, materia di insegnamento e stipendio.
//  Scrivere un breve programma per collaudare la classe.

package com.school_docente;

public class Docente {
    private String nome;
    private String cognome;
    private String materiaDiInsegnamento;
    private double stipendio;

    public Docente() {
    }

    public Docente(String nome, String cognome, double stipendio) {
        this.nome = nome;
        this.cognome = cognome;
        this.stipendio = stipendio;
    }

    public Docente(String nome, String cognome, String materiaDiInsegnamento, double stipendio) {
        this.nome = nome;
        this.cognome = cognome;
        this.materiaDiInsegnamento = materiaDiInsegnamento;
        this.stipendio = stipendio;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getMateriaDiInsegnamento() {
        return materiaDiInsegnamento;
    }

    public double getStipendio() {
        return stipendio;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void setMateriaDiInsegnamento(String materiaDiInsegnamento) {
        this.materiaDiInsegnamento = materiaDiInsegnamento;
    }

    public void setStipendio(double stipendio) {
        this.stipendio = stipendio;
    }

    public void print() {
        System.out.println("\n=======================================\n" +
                "Nome: " + getNome() + "\nCognome: " + getCognome() + "\nMateria Di Insegnamento: "
        + getMateriaDiInsegnamento() + "\nStipendio: " + getStipendio());
    }
}
