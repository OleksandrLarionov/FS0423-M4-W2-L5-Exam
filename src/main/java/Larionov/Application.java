package Larionov;

import Larionov.entities.*;
import com.github.javafaker.Faker;

import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.function.Supplier;

public class Application {

    public static void main(String[] args) {
        Faker faker = new Faker(Locale.ITALY);
//        **********************CREAZIONE DELL'ARCHIVIO'**********************
        Archivio archivio = new Archivio();


//        "**********************CREAZIONE DEI LIBRI'**********************")

        Supplier<Integer> supplieruplyYear = () -> {
            Random rndm = new Random();
            return rndm.nextInt(1899,2023);
        };

        Supplier<Integer> supplieruplyRandomPages = () -> {
            Random rndm = new Random();
            return rndm.nextInt(50,452);
        };

        Supplier<Libro> booksSupplier = () -> new Libro(faker.gameOfThrones().character(),supplieruplyYear.get(),supplieruplyRandomPages.get(), Genere.Fantasy, faker.name().firstName());
        for (int i = 0; i < 3; i++) {
            archivio.aggiungiAlCatalogo(booksSupplier.get());
        }

//        **********************CREAZIONE DELLE REVISTE'**********************")

        Supplier<Integer> supplieruplyRandomPagesReviste = () -> {
            Random rndm = new Random();
            return rndm.nextInt(10,40);
        };

        Supplier<Riviste> revisteSupplier = () -> new Riviste(faker.food().dish(),supplieruplyYear.get(),supplieruplyRandomPagesReviste.get(), Periodicita.SEMESTRALE );
        for (int i = 0; i < 5; i++){
            archivio.aggiungiAlCatalogo(revisteSupplier.get());
        }

        System.out.println("**********************IL CATALOGO'**********************");
        archivio.stampaCatalogo();

//        **********************RIMUOVI DAL CATALOGO PER ISBN'**********************TEST
        Libro libroPersonalizzato = new Libro("peppa",2023,200,Genere.Fantasy, "ME");
        archivio.aggiungiAlCatalogo(libroPersonalizzato);

        System.out.println("**********************PRIMA DELLA RIMOZIONE**********************");
        archivio.stampaCatalogo();

        System.out.println(libroPersonalizzato.getCodiceIsbn());

//        archivio.rimuoviDalCatalogoPerIsbn(libroPersonalizzato.getCodiceIsbn());

        System.out.println("**********************DOPO DELLA RIMOZIONE**********************");
        archivio.stampaCatalogo();

        System.out.println("**********************RICERCA ISBN**********************");
        System.out.println(archivio.cercaPerIsbn(libroPersonalizzato.getCodiceIsbn()));

        System.out.println("**********************RICERCA PER AUTORE**********************");
        System.out.println(archivio.cercaPerAutore("ME"));

        System.out.println("**********************RICERCA PER L'ANNO**********************");
        System.out.println(archivio.cercaPerAnno(2023));


    }
}
