package com.school_studente_v2;
//DONE creare la classe studente con i seguenti attributi: codicealunno, cognome, nome, classe, voto.
//DONE creare il metodo costruttore per inserire il  codicealunno, cognome, nome e classe,
// mentre il voto deve essere posto a zero;
//DONE creare metodi get, set e stampa;
//TODO creare il metodo aggiungivoto, per inserire il voto all'alunno;
//TODO creare il metodo modificaclasse, per modificare la classe dell'alunno con la classe nuova inserita da tastiera;
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

    public void setCodiceAlunno(String codiceAlunno) {
        this.codiceAlunno = codiceAlunno;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public byte getVoto() {
        return voto;
    }

    public byte setVoto() {
        this.voto = voto;
        return 0;
    }

    public void stampa() {
        System.out.println("\nCodice Alunno: " + getCodiceAlunno() +
                "\nNome: " + getNome() + " " + getCognome()
                + "\nClasse: " + getClasse() + "\nVoto: " + getVoto());
    }

    public void aggiungiVoto() {
        voto = setVoto();
    }


}
