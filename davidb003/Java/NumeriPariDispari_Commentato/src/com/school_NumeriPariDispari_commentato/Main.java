package com.school_NumeriPariDispari_commentato;

public class Main {

    public static void main(String[] args) {
        public class NumeriPariDispari {
            public static void main(String[] arg) {
                int numeroIntero;
                numeroIntero = (int)(Math.random()*11 + 20);
                System.out.println("\nNumero scelto: " + numeroIntero + ".");
                if (numeroIntero % 2 == 0) {
                    System.out.println();
                    System.out.println("Il numero e' pari\n");
                }
                else
                    System.out.println("Il numero e' dispari\n");
            }
        }
    }
}
