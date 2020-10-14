
package com.school_inputcontocorrente;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner inputcontocorrente= new Scanner(System.in);
        System.out.println("===== INPUT =====\n");
        System.out.print("\nNome Intestatario: ");
        String nomeCognome= inputcontocorrente.next();
        System.out.print("\nInserisci importo del primo versamento: ");
        String saldo= inputcontocorrente.next();
        System.out.print("\nInserisci data di nascita: ");
        String dataDiNascita= inputcontocorrente.next();
        String IBAN= "FR9114508000507812136124P15";
        String fido= "1000";
        System.out.println("\n\n===== OUTPUT =====\n");
        System.out.println("Intestatario: " + nomeCognome + "\nSaldo: EUR " + saldo +
                "\nData di nascita: " + dataDiNascita + "\nIBAN: " + IBAN + "\nFido massimo: EUR " + fido);
    }
}
