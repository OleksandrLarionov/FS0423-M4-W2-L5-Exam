package Larionov.entities;

public class Libri extends Catalogo{
private String autore;
private Genere genere;

    public Libri(String titolo, int annoDiPubblicazione, int numeroDiPagine, Genere genere, String autore ) {
        super(titolo, annoDiPubblicazione, numeroDiPagine);
        this.autore = autore;
        this.genere = genere;
    }

    public String getAutore() {
        return autore;
    }

    public Genere getGenere() {
        return genere;
    }
}
