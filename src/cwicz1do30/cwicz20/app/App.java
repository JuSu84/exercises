package cwicz1do30.cwicz20.app;

import cwicz1do30.cwicz20.logic.CoinToss;

public class App {

    public static void main(String[] args) {

        CoinToss coinToss = new CoinToss();
        coinToss.betResult();
        coinToss.flipCoin();
        coinToss.showResult();

        coinToss.betResult();
        coinToss.flipCoin();
        coinToss.showResult();
    }


}
