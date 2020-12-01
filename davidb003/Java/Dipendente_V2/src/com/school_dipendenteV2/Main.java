package com.school_dipendenteV2;

public class Main {

    public static void main(String[] args) {
        Dipendente dipendente = new Dipendente("Cazimir", "Maftei", "Supporto Clienti",
                "Orange S.A.", 1000F);

        Dipendente.aumento(20F);

        Dipendente.bonus(300F);

        Dipendente.print();

    }
}
