package cwicz1do30.cwicz14;

import cwicz1do30.cwicz14.client.Client;
import cwicz1do30.cwicz14.service.DiscountService;
import cwicz1do30.cwicz14.service.PrintService;

public class App {

    public static void main(String[] args) {
        Client client1 = new Client( null, true, "Bajda");
        Client client2 = new Client("Asia", false, null);
        Client client3 = new Client();
        double price = 1100;
        PrintService printService = new PrintService();

        DiscountService discountService = new DiscountService();

        double priceAfterDiscount1 = discountService.calculateDiscount(client1, price);
        double priceAfterDiscount2 = discountService.calculateDiscount(client2, price);
        double priceAfterDiscount3 = discountService.calculateDiscount(client2, price);

        printService.printInfo(client1, price, priceAfterDiscount1);
        printService.printInfo(client2, price, priceAfterDiscount2);
        printService.printInfo(client3, price, priceAfterDiscount3);

    }
}
