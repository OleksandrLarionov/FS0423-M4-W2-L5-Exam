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

        Supplier<Libri> booksSupplier = () -> new Libri(faker.gameOfThrones().character(),supplieruplyYear.get(),supplieruplyRandomPages.get(), Genere.Fantasy, faker.name().firstName());
        for (int i = 0; i < 100; i++) {
            archivio.aggiunguiAlCatalogo(booksSupplier.get());
        }

//        **********************CREAZIONE DELLE REVISTE'**********************")

        Supplier<Integer> supplieruplyRandomPagesReviste = () -> {
            Random rndm = new Random();
            return rndm.nextInt(10,40);
        };

        Supplier<Riviste> revisteSupplier = () -> new Riviste(faker.food().dish(),supplieruplyYear.get(),supplieruplyRandomPagesReviste.get() );
        for (int i = 0; i < 50; i++){
            archivio.aggiunguiAlCatalogo(revisteSupplier.get());
        }

        System.out.println("**********************IL CATALOGO'**********************");
        archivio.stampaCatalogo();
    }
}
