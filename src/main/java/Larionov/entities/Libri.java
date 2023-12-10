package Larionov.entities;

import java.time.LocalDate;

public class Libri extends Catalogo{
private String Autore;
private Genere genere;

    public Libri(String titolo, int annoDiPubblicazione, int numeroDiPagine, String autore, Genere genere) {
        super(titolo, annoDiPubblicazione, numeroDiPagine);
        Autore = autore;
        this.genere = genere;
    }

    public String getAutore() {
        return Autore;
    }

    public Genere getGenere() {
        return genere;
    }
}
