package com.school_studente_v2;
//DONE creare la classe studente con i seguenti attributi: codicealunno, cognome, nome, classe, voto.
//DONE creare il metodo costruttore per inserire il  codicealunno, cognome, nome e classe,
// mentre il voto deve essere posto a zero;
//DONE creare metodi get, set e stampa;
//DONE creare il metodo aggiungivoto, per inserire il voto all'alunno;
//DONE creare il metodo modificaclasse, per modificare la classe dell'alunno con la classe nuova inserita da tastiera;
//TODO creare il metodo esito, per visualizzare se alunno è promosso(se voto >= a 6), respinto( se voto<di 6);
public class studente {
    private String codiceAlunno;
    private String cognome;
    private String nome;
    private String classe;
    private byte voto = 0;

    public studente() {
        this.codiceAlunno = codiceAlunno;
        this.cognome = cognome;
        this.nome = nome;
        this.classe = classe;
    }

    public String getCodiceAlunno() {
        return codiceAlunno;
    }

    public String setCodiceAlunno() {
        this.codiceAlunno = codiceAlunno;
        return codiceAlunno;
    }

    public String getCognome() {
        return cognome;
    }

    public String setCognome() {
        this.cognome = cognome;
        return cognome;
    }

    public String getNome() {
        return nome;
    }

    public String setNome() {
        this.nome = nome;
        return null;
    }

    public String getClasse() {
        return classe;
    }

    public String setClasse() {
        this.classe = classe;
        return null;
    }

    public byte getVoto() {
        return voto;
    }

    public byte setVoto(byte nuovoVoto) {
        this.voto = voto;
        return 0;
    }

    public void stampa() {
        System.out.println("\nCodice Alunno: " + getCodiceAlunno() +
                "\nNome: " + getNome() + " " + getCognome()
                + "\nClasse: " + getClasse() + "\nVoto: " + getVoto());
    }

    public void aggiungiVoto(byte nuovoVoto) {
        setVoto(nuovoVoto);
    }

    public void modificaClasse() {
        String codiceAlunno = setCodiceAlunno();
        String cognome = setCognome();
        String nome = setNome();
        String classe = setClasse();
    }



}
