package com.school_dipendenteV3;

public class Dipendente {
    private String nome;
    private double stipendio;

    public Dipendente() {
    }

    public Dipendente(String nome, double stipendio) {
        this.nome = nome;
        this.stipendio = stipendio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getStipendio() {
        return stipendio;
    }

    public void setStipendio(double stipendio) {
        this.stipendio = stipendio;
    }

    public void print() {
        System.out.println("\n------------------------\n" +
                "Nome: " + getNome() + "\nStipendio: " + getStipendio());
    }
}
