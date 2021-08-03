package cwiczenia31do60.cwicz47;

public class Cart {
    private static final int MAX_PRODUCTS_IN_CART = 10;

    private Product[] products = new Product[MAX_PRODUCTS_IN_CART];
    private int productsCounter;

    public boolean add(Product product) {
        if (productsCounter < MAX_PRODUCTS_IN_CART) {
            products[productsCounter] = product;
            productsCounter++;
            return true;
        } else {
            return false;
        }
    }

    double totalCost(){
        return sumPrices(0);

    }

    private double sumPrices(int counter) {
        if (counter < (productsCounter-1))
            return products[counter].getPrice() + sumPrices(++counter);
        else
            return products[counter].getPrice();
    }

    public void printCart() {

        for (Product product : products) {
            if (!(product == null))
                System.out.println(product);
        }
    }
}
