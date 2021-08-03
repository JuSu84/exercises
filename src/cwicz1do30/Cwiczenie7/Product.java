package cwicz1do30.Cwiczenie7;

public class Product {
    String name;
    String producer;

    public Product(String name, String producer) {
        this.name = name;
        this.producer = producer;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", producer='" + producer + '\'' +
                '}';
    }
}
