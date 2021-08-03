package cwiczenia31do60.cwicz53;

import java.io.FileNotFoundException;
import java.util.Arrays;

public class App {

    public static void main(String[] args) {

        try{
            Offer[] offers = OfferReader.readOffers("pices.o");
            Arrays.sort(offers);
            for (Offer offer : offers) {
                System.out.println(offer);
            }
        } catch (FileNotFoundException e) {
            System.err.println("Brak pliku pices.o");
        }
    }
}
