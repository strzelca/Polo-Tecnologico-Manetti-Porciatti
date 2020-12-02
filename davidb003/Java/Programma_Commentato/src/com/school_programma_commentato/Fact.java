package com.school_programma_commentato;

public class Fact {
    private int n; // Dichiarazione variabile

    public Fact(int k) { // Dichiara il metodo Fact
        n = k; // Assegna K ad N
    }

    public long conv() { // Dichiara il metodo conv
        int i = 1; // Assegna 1 ad i
        long result = 1; // Dichiara la variabile "long" result
        while (i <= n) { // Ciclo while
            result = result * i; // Esegue il calcolo result * i e lo assegna a result
            i++; // Incrementa i di 1 ogni volta che questa istruzione viene eseguita
        }
        return result;
    }
}
