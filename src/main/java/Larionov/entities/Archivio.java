package Larionov.entities;

import javax.swing.plaf.PanelUI;
import java.util.ArrayList;
import java.util.List;

public class Archivio {
    private List<Catalogo> catalogo;

    public Archivio() {
        this.catalogo = new ArrayList<>();
    }
    public void aggiungiAlCatalogo(Catalogo articolo){
        catalogo.add(articolo);
    }

    public void rimuoviDalCatalogoPerIsbn(Long isbn){
        catalogo = catalogo.stream().filter(articolo -> articolo.getCodiceIsbn() != isbn).toList();
    }

    public void stampaCatalogo(){
        catalogo.stream().forEach(System.out::println);
    }

    public List<Catalogo> cercaPerAutore (String autore){
        if (autore == null) {
            throw new IllegalArgumentException("Qualcuno ha scritto questo libro");
        }
        return catalogo.stream().filter(libro -> autore.equals(libro.getAutore())).toList();
    }

    public List<Catalogo> cercaPerAnno (int anno){
        if (anno < 1800 || anno > 2023) {
            throw new IllegalArgumentException("Nel Archivio non ci sono libri con questa data");
        }
        return catalogo.stream().filter(libro -> libro.getAnnoDiPubblicazione() == anno).toList();
    }

    public List<Catalogo> getCatalogo() {
        return catalogo;
    }

    public void salvaSuDisco(){};

    public void caricaDaDisco(){};

    @Override
    public String toString() {
        return "Archivio{" +
                "catalogo=" + catalogo +
                '}';
    }
}
