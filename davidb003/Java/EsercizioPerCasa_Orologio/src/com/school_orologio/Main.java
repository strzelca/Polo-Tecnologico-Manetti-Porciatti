package com.school_orologio;

public class Main {

    public static void main(String[] args) {
        Orologio orologio = new Orologio();

        orologio.setOre((byte) 3);
        orologio.setMinuti((byte) 33);

        orologio.stampa();
    }
}
