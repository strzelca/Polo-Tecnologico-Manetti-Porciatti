package com.school_contocorrente;

public class contocorrente {
    static String intestatario;
    static String IBAN;
    static int saldo;
    static int fido;
    static boolean debitore;

    contocorrente(){}

    contocorrente(String intestatario, String IBAN, int saldo, int fido, boolean debitore) {
        this.intestatario = intestatario;
        this.IBAN = IBAN;
        this.saldo = saldo;
        this.fido = fido;
        this.debitore = debitore;
    }
}
