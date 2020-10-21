package com.interrogazione_classealcunno;

public class Main {

    public static void main(String[] args) {
        Alunno davide = new Alunno("Davide", "Ballerini", "Informatica", 7);

        System.out.println(davide.getNome());
        System.out.println(davide.getCognome());
        System.out.println(davide.getMateria());
        System.out.println(davide.getVoto());
    }
}
