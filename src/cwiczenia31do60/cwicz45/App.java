package cwiczenia31do60.cwicz45;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        final String fileName = "clients.csv";

        try {
            Client[] clients = ClientDataReader.readFile(fileName);
            printMostValualbleClient(clients);
            String country = readCountryFromUser();
            printClientsFromCountry(clients, country);
            printAvgValue(clients, country);
        } catch (FileNotFoundException e) {
            System.err.println("Brak pliku o nazwie " + fileName);


        }
    }

    private static void printAvgValue(Client[] clients, String country) {
        double totalValue = 0;
        int clientsFromCountryCounter = 0;
        for (Client client : clients) {
            if (country.equals(client.getCountry())) {
                totalValue += client.getValue();
                clientsFromCountryCounter++;
            }
        }
        if (totalValue > 0) {
            double avgValue = totalValue / clientsFromCountryCounter;
            System.out.printf("Srednia wartość zakupów z %s to %.2f", country, avgValue);
        }
    }

    private static void printClientsFromCountry(Client[] clients, String country) {
        System.out.println("Klienci z kraju " + country + ": ");
        boolean atLeastOneClient = false;
        for (Client client : clients) {
            if (country.equals(client.getCountry())) {
                System.out.println(client);
                atLeastOneClient = true;
            }
        }
        if (!atLeastOneClient) {
            System.out.println("Brak klientów");
        }
    }


    private static String readCountryFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj nazwę kraju z którego klienci cię interesują");
        return scanner.nextLine();
    }


    private static void printMostValualbleClient(Client[] clients) {
        Client mostValuableClient = clients[0];
        for (Client client : clients) {
            if (client.getValue() > mostValuableClient.getValue()) {
                mostValuableClient = client;
            }
        }
        System.out.println("Najbardziej wartościowy klient to: " + mostValuableClient);
    }
}
