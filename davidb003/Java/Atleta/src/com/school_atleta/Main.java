package com.school_atleta;

public class Main {

    public static void main(String[] args) {

        Atleta atleta = new Atleta("Gabriel", "Smusi",
                "Manchester City", "Calciatore");

        atleta.modificaRuolo("OwO");

        atleta.modificaSquadra("UwU");

        atleta.visualizzaCalciatore();
    }
}
