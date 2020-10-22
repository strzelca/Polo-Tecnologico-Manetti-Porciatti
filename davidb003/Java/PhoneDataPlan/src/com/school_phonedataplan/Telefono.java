package com.school_phonedataplan;

public class Telefono {

    private String nomeTelefono;
    private boolean stato;
    private int minutiConsumati;
    private float credito;
    private int internetConsumato;

    /* Costruttore */

   // Telefono(String nomeTelefono) {
   //     this.nomeTelefono = nomeTelefono;
   //     this.stato = false;
   //     this.minutiConsumati = 0;
   //     this.credito = 0;
   //     this.internetConsumato = 0;
   // }

    Telefono(String nomeTelefono) {
        setNomeTelefono(nomeTelefono);
        setStato(false);
        setInternetConsumato(0);
        setMinutiConsumati(0);
        setCredito(0);
    }

    /* GETTER SETTER */

    public String getNomeTelefono() { return nomeTelefono; }


    public void setNomeTelefono(String nomeTelefono) {
        this.nomeTelefono = nomeTelefono;
    }

    public boolean isStato() { return stato; }
    public void setStato(boolean stato) { this.stato = stato; }

    public int getMinutiConsumati() { return minutiConsumati; }
    public void setMinutiConsumati(int minutiConsumati) { this.minutiConsumati = minutiConsumati; }

    public float getCredito() { return credito; }
    public void setCredito(float credito) { this.credito = credito; }

    public int getInternetConsumato() { return internetConsumato; }
    public void setInternetConsumato(int internetConsumato) { this.internetConsumato = internetConsumato; }

    /* Funzioni */

    public void ricarica() {
        setCredito(getCredito()+20);
    }

    /* public void ricarica() {
        credito = credito + 20;
    }

    public void ricarica(float importo) {
        credito = credito + importo;
    } */

    public void cambiaStato () { setStato(!isStato()); }

    /* public void accendi () {
        if stato = false
        stato = true;
    }

    public void spegni () {
        if stato = true
        stato = false;
    }

    public void cambiaStato1 () {
        if
        (stato = true)
        {
            stato = false;
        }
        else
        {
            stato = true;
        }
    }
   */


    public void telefonata() {
        if (isStato() && getCredito()>=1) {
            setMinutiConsumati(getMinutiConsumati()+3);
            setCredito(getCredito()-1);
            System.out.println("Chiamata Effettuata");
        } else if ( isStato() && getCredito()<=1 ) {
            System.out.println("Credito Insufficente");
        } else if ( !isStato() ){
            System.out.println("Telefono Spento");
        }
    }

    public void connessione() {
        if (isStato() && getCredito()>=2) {
            setCredito(getCredito()-2);
            setInternetConsumato(getInternetConsumato()+1);
            System.out.println("Connessione Riuscita");
        } else if ( isStato() && getCredito()<=2 ) {
            System.out.println("Credito Insufficente");
        } else if ( !isStato() ){
            System.out.println("Telefono Spento");
        }
    }

    public void stampa() {
        System.out.println( "\nNome: " + getNomeTelefono() +
                            "\nStato: " + (isStato() ? "Acceso" : "Spento") +
                            "\nCredito: " + getCredito() +
                            "\nMinuti Consumati: " + getMinutiConsumati() +
                            "\nInternet Consumato: " + getInternetConsumato());
    }

}
