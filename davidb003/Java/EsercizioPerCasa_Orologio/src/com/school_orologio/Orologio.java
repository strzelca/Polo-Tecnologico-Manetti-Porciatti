package com.school_orologio;

		/* Descrivere la classe orologio che registra le ore e i minuti
        Definire 3 costruttori:
        1. Inizializzare l'orologio ad un ora di default (es. 00:00)
        2. Inizializzare solo le ore
        3. Inizializzare sia le ore sia i minuti

        Inizializzare i metodi get e set, il metodo stampa

        Fare un menù
        1. inizializza le ore al default
        2. Inizializza solo le ore
        3. Inizializza sia le ore che i minuti
        4. Fine
	 */

public class Orologio {
    private byte ore;
    private byte minuti;

    Orologio() {
        setOre((byte) 0);
    }

    Orologio(byte ore) {
        setOre(ore);
    }

    Orologio(byte ore, byte minuti) {
        setOre(ore);
        setMinuti(minuti);
    }

    public byte getOre() {
        return ore;
    }

    public void setOre(byte ore) {
        this.ore = ore;
    }

    public byte getMinuti() {
        return minuti;
    }

    public void setMinuti(byte minuti) {
        this.minuti = minuti;
    }

    public void stampa() {
        System.out.println("\nOre: " + getOre() +
                            "\nMinuti: " + getMinuti());
    }
}
