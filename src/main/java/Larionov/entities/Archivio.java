package Larionov.entities;

import java.util.ArrayList;
import java.util.List;

public class Archivio {
    private List<Catalogo> catalogo;

    public Archivio() {
        this.catalogo = new ArrayList<>();
    }
    public void aggiunguiAlCatalogo(Catalogo elemento){
        catalogo.add(elemento);
    }

    public void rimuoviDalCatalogoPerIsbn(Long isbn){
        catalogo = catalogo.stream().filter(articolo -> articolo.getCodiceIsbn() != isbn).toList();
    }

    public void stampaCatalogo(){
        catalogo.stream().forEach(System.out::println);
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
