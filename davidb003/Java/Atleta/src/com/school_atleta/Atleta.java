// DONE Definisci la classe atleta per rappresentare le
//  informazioni di un calciatore con gli attributi:
//  - Nome
//  - Cognome
//  - Squadra di appartenenza
//  - Ruolo
//
// DONE Ed i metodi:
//  - Costruttore, per inizializzare un nuovo calciatore
//  - Modifica il ruolo
//  - Modifica la squadra di appartenenza
//  - Visualizza calciatore

package com.school_atleta;

public class Atleta {
    private String nome;
    private String cognome;
    private String ruolo;
    private String squadraDiAppartenenza;

    public Atleta(String nome, String cognome, String squadraDiAppartenenza, String ruolo) {
        this.nome = nome;
        this.cognome = cognome;
        this.squadraDiAppartenenza = squadraDiAppartenenza;
        this.ruolo = ruolo;
    }

    public void setSquadraDiAppartenenza(String squadraDiAppartenenza) {
        this.squadraDiAppartenenza = squadraDiAppartenenza;
    }


    public void setRuolo(String ruolo) {
        this.ruolo = ruolo;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getRuolo() {
        return ruolo;
    }

    public String getSquadraDiAppartenenza() {
        return squadraDiAppartenenza;
    }

    public void modificaRuolo(String inputNuovoRuolo) {
        setRuolo(inputNuovoRuolo);
    }

    public void modificaSquadra(String inputModificaSquadra) {
        setSquadraDiAppartenenza(inputModificaSquadra);
    }

    public void visualizzaCalciatore() {
            System.out.println("=== DATI CALCIATORE ===\n" +
                "Nome: " + getNome() + " " + getCognome() + "\nRuolo: " + getRuolo() +
                "\nSquadra di appartenenza: " + getSquadraDiAppartenenza());
    }
}
