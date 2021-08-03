package cwicz1do30.cwicz12.application;

import cwicz1do30.cwicz12.logic.Charger;
import cwicz1do30.cwicz12.model.Telephone;

class PhoneTest {
    public static void main(String[] args) {
        Telephone telephone = new Telephone("Samsung", "Galaxy S10",
                3400, 75);
        Charger charger = new Charger();

        System.out.println(telephone);
        charger.charge(telephone);
        charger.charge(telephone);
        charger.charge(telephone);
        charger.charge(telephone);
        System.out.println(telephone);


    }
}
