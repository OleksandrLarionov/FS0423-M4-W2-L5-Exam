package Larionov.entities;



public class Libro extends Catalogo{
private  String autore;
private Genere genere;

    public Libro(String titolo, int annoDiPubblicazione, int numeroDiPagine, Genere genere, String autore ) {
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
