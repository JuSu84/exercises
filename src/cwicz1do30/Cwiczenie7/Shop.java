package cwicz1do30.Cwiczenie7;

public class Shop {
    public static void main(String[] args) {

        Offer offer = new Offer(
                new Product("czekolada mleczna", "Milka")
                , 3.99, true);

        System.out.println(offer.toString());
    }
}
