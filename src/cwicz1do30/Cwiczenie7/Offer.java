package cwicz1do30.Cwiczenie7;

public class Offer {
    Product product;
    double price;
    boolean special;

    public Offer(Product product, double price, boolean special) {
        this.product = product;
        this.price = price;
        this.special = special;
    }

    @Override
    public String toString() {
        return  product +
                ", price=" + price +
                ", special=" + special +
                '}';
    }
}
