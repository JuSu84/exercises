package cwicz1do30.Cwiczenie4;

public class Auction {
    String title;
    String description;
    double price;
     Person seller;


    void printInfo(){
        System.out.println("Aukcja dotyczy: " + title +", "+ description + " w cenie: "
                + price + " zł sprzedający " + seller);
    }

    @Override
    public String toString() {
        return "Auction{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", seller=" + seller +
                '}';
    }
}
