package Larionov.entities;

import java.time.LocalDate;

public class Riviste extends Catalogo {
    private Periodicita periodicita;

    public Riviste(String titolo, int annoDiPubblicazione, int numeroDiPagine) {
        super(titolo, annoDiPubblicazione, numeroDiPagine);
    }

    public Periodicita getPeriodicita() {
        return periodicita;
    }
}
