package com.interrogazione_classealcunno;

public class Alunno {
    String Nome;
    String Cognome;
    String Materia;
    int Voto;

    Alunno(String Nome, String  Cognome, String Materia, int Voto) {
        setNome(Nome);
        setCognome(Cognome);
        setMateria(Materia);
        setVoto(Voto);
    }


    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getCognome() {
        return Cognome;
    }

    public void setCognome(String Nome) {
        this.Cognome = Cognome;
    }

    public String getMateria() {
        return Materia;
    }

    public void setMateria(String Nome) {
        this.Materia = Materia;
    }

    public int setVoto(int Voto) {
        return Voto;
    }

    public void getVoto(int Voto) {
        this.Voto = Voto;
    }

    public int getVoto() {
        return Voto;
    }

}



