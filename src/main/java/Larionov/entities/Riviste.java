package Larionov.entities;



public class Riviste extends Catalogo {
    private Periodicita periodicita;

    public Riviste(String titolo, int annoDiPubblicazione, int numeroDiPagine, Periodicita periodicita) {
        super(titolo, annoDiPubblicazione, numeroDiPagine);
        this.periodicita = periodicita;
    }

    public Periodicita getPeriodicita() {
        return periodicita;
    }

    @Override
    public String getAutore() {
        return null;
    }
}
