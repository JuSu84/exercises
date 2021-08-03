package cwicz1do30.cwicz20.logic;

import java.util.Random;
import java.util.Scanner;

public class CoinToss {
    private Scanner imput = new Scanner(System.in);
    private Random random = new Random();

    private final int orzeł = 1;
    private final int reszka = 0;
    private final int noChoice = -1;
    private int userChoice = noChoice;
    private int flipResult = noChoice;

    public void betResult() {
        showOptions();
        userChoice = imput.nextInt();
    }

    public void flipCoin() {
        flipResult = random.nextInt(2);
    }

    private void showOptions() {
        System.out.println("Wybierz jedną z dwóch opcji");
        System.out.println(orzeł + " - orzeł");
        System.out.println(reszka + " - reszka");
    }

    public void showResult() {
        if (userChoice == flipResult) {
            if (flipResult == orzeł) {
                System.out.println("Brawo wygrałeś wypadł orzeł");
            } else {
                System.out.println("Brawo wygrałeś wypadła reszka");
            }
        } else {
            System.out.println("Niestety przegrałeś");
        }
    }
}
