package com.school_orologio;

public class Orologio {
    private byte ore;
    private byte minuti;
    

    Orologio(int ore, int minuti) {
        setOre(ore);
        setMinuti(minuti);
    }

    public byte getOre() {
        return ore;
    }
    public byte getMinuti() {
        return minuti;
    }

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

}
