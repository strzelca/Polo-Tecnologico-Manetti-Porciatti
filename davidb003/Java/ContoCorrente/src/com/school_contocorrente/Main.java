package com.school_contocorrente;

public class Main {

    public static void main(String[] args) {
        contocorrente BrunoStrati = new contocorrente("Bruno Strati",
                "FR86568GHGH780000248G", 1500, 2000, false);

        System.out.println("Intestatario: " + contocorrente.intestatario +
                "\nIBAN: " + contocorrente.IBAN + "\nSaldo disponibile: EUR "
                + contocorrente.saldo + "\nFido possibile: EUR " + contocorrente.fido
                + "\nDebitore: " + contocorrente.debitore);
    }
}
