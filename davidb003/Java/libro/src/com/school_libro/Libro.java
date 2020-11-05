package com.school_libro;

public class Libro {
    /* Creare la classe libro con i seguenti attributi:
- Titolo
- Autore
- Prezzo
- Casa editrice
DONE 1. Metodo costruttore
DONE 2. set e get
DONE 3. stampa
TODO 4. aggiorna prezzo inserendo in input il nuovo importo

*/

    private String titolo;
    private String autore;
    private float prezzo;
    private String casaEditrice;

    Libro() {
        setTitolo(titolo);
        setAutore(autore);
        setPrezzo(prezzo);
        setCasaEditrice(casaEditrice);
    }


    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public float getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(float prezzo) {
        this.prezzo = prezzo;
    }

    public String getCasaEditrice() {
        return casaEditrice;
    }

    public void setCasaEditrice(String casaEditrice) {
        this.casaEditrice = casaEditrice;
    }

    public void stampa() {
        System.out.println("\n===== DATI LIBRO =====\n" +
                "Titolo " + getTitolo() + "\nAutore: " + getAutore() + "\nPrezzo: €" + getPrezzo() +
                 "\nCasa Editrice: " + getCasaEditrice());
    }

}
