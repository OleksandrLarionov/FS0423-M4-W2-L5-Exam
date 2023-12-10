package Larionov.entities;

import java.time.LocalDate;

public class Riviste extends Catalogo {
    private Periodicita periodicita;

    public Riviste(String titolo, LocalDate annoDiPubblicazione, int numeroDiPagine) {
        super(titolo, annoDiPubblicazione, numeroDiPagine);
    }
}
