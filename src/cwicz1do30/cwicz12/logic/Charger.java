package cwicz1do30.cwicz12.logic;

import cwicz1do30.cwicz12.model.Telephone;

public class Charger {

    public void charge(Telephone t){
        int recharge = t.getChargeLevel() +1;
        t.setChargeLevel(recharge);
    }
}
