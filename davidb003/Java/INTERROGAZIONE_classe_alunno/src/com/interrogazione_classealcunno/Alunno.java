package com.interrogazione_classealcunno;

public class Alunno {
    String Nome;
    String Cognome;
    String Materia;
    int Voto;

    Alunno(String Nome, String Cognome, String Materia, int Voto) {
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

    public void setCognome(String Cognome) {
        this.Cognome = Cognome;
    }

    public String getMateria() {
        return Materia;
    }

    public void setMateria(String Materia) {
        this.Materia = Materia;
    }

    public int getVoto() {
        return Voto;
    }

    public void setVoto(int Voto) { this.Voto = Voto; }





}



