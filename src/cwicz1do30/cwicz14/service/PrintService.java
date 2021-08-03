package cwicz1do30.cwicz14.service;

import cwicz1do30.cwicz14.client.Client;

public class PrintService {

    public void printInfo(Client client, double priceBeforeDicount, double priceAfterDiscount) {

        printWelcomeMsg(client);
        printPrices(priceBeforeDicount, priceAfterDiscount);
    }

    private void printPrices(double priceBeforeDicount, double priceAfterDiscount) {
        System.out.println("Kwota przed rabatem " + priceBeforeDicount);
        System.out.println("Do zapłaty (po rabacie) " + priceAfterDiscount);
    }

    private void printWelcomeMsg(Client client) {
        if (client.getFirstName() != null && client.getLastName() != null)
            System.out.println("Witaj " + client.getFirstName() + " " + client.getLastName());
        else if (client.getFirstName() == null && client.getLastName() != null)
            System.out.println("Dzień dobry panie/pani " + client.getLastName());
        else if (client.getFirstName() != null && client.getLastName() == null)
            System.out.println("Witaj " + client.getFirstName());
        else
            System.out.println("Witaj nieznajomy");
    }
}
