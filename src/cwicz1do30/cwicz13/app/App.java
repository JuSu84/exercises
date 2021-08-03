package cwicz1do30.cwicz13.app;

import cwicz1do30.cwicz13.number.NumberUtils;

import java.util.Random;

public class App {
    public static void main(String[] args) {

        NumberUtils numberUtils = new NumberUtils();
        Random random = new Random();

        int randomInt = random.nextInt();


        System.out.println(numberUtils);
        numberUtils.compareNumberAndPrint(randomInt, 5000);
        numberUtils.metoda2(numberUtils.getX());
        numberUtils.parzysta(numberUtils.getX());

    }

}
