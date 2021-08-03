package cwiczenia31do60.cwicz47;

public class App {

    public static void main(String[] args) {

        Cart cart = new Cart();
        cart.add(new Product("cola", 7.50));
        cart.add(new Product("piwo", 4.50));
        cart.add(new Product("krem", 17.50));

        cart.printCart();
        double totalCost = cart.totalCost();
        System.out.println("Wartość całego koszyka to: " + totalCost);

    }
}
