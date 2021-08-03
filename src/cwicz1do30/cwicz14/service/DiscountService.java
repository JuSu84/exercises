package cwicz1do30.cwicz14.service;

import cwicz1do30.cwicz14.client.Client;

public class DiscountService {

    public double calculateDiscount(Client client, double price){
        if(client.isPremium())
            return calculatePremiumDicount(price);
        else
            return calculateStandardDiscoun(price);

    }

    private double calculateStandardDiscoun(double price) {
        if(price>=1000)
            return applyDiscout(price, 0.1);
        else
            return price;
    }

    private double calculatePremiumDicount(double price) {
        if(price>=1000)
            return applyDiscout(price, 0.15);
        else
        return applyDiscout(price, 0.05);
    }

    private double applyDiscout(double price, double discount) {
        return price * (1- discount);
    }



}
