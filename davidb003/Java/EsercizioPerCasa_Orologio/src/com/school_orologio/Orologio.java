package com.school_orologio;

public class Orologio {
    private byte ore;
    private byte minuti;
    private byte inputIncremento;
    

    Orologio(int ore, int minuti) {
        setOre(ore);
        setMinuti(minuti);
    }

    public byte getOre() {
        return ore;
    }
    public byte getMinuti() { return minuti; }

    public void setOre(int ore) {
        this.ore = (byte) ore;
    }
    public void setMinuti(int minuti) {
        this.minuti = (byte) minuti;
    }

    public void stampa() {
        System.out.println("Orario:");
        System.out.format("%02d:%02d\n\n", getOre(), getMinuti());
    }

    public void incrementoOre(byte inputIncremento) {
        ore = (byte) (ore + inputIncremento);
        if (ore > 24) {
            ore = (byte) (ore - inputIncremento);
            System.out.println("Orario maggiore di 24");
        }
    }

}
