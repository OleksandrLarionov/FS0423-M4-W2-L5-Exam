package Larionov.entities;

import java.time.LocalDate;
import java.util.List;
import java.util.Random;

public abstract class Catalogo {
    private long CodiceIsbn;
    private String Titolo;
    private LocalDate AnnoDiPubblicazione;
    private int NumeroDiPagine;


    public Catalogo(String titolo, LocalDate annoDiPubblicazione, int numeroDiPagine) {
        Random rndm = new Random();
        CodiceIsbn = rndm.nextInt(1,100000);
        Titolo = titolo;
        AnnoDiPubblicazione = annoDiPubblicazione;
        NumeroDiPagine = numeroDiPagine;

    }

    public long getCodiceIsbn() {
        return CodiceIsbn;
    }

    public String getTitolo() {
        return Titolo;
    }

    public LocalDate getAnnoDiPubblicazione() {
        return AnnoDiPubblicazione;
    }

    public int getNumeroDiPagine() {
        return NumeroDiPagine;
    }

    @Override
    public String toString() {
        return "Catalogo{" +
                "CodiceIsbn=" + CodiceIsbn +
                ", Titolo='" + Titolo + '\'' +
                ", AnnoDiPubblicazione=" + AnnoDiPubblicazione +
                ", NumeroDiPagine=" + NumeroDiPagine +
                '}';
    }
}
