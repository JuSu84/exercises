package cwicz1do30.cwicz27.logic;

import java.util.Scanner;

public class Logic {

    private static void printMessage() {
        System.out.println("Podaj liczbę");
    }

    public static void orEven(int sum) {
        if (sum % 2 == 0) {
            System.out.println("Suma podanych liczb = " + sum + " i jest parzysta ");
        } else {
            System.out.println("Suma podanych liczb = " + sum + " i jest nieparzysta ");
        }
    }

    public static int readNumber(Scanner scanner) {
        int sum = 0;
        int number = 0;
        printMessage();
        while ((number = scanner.nextInt()) <= 100) {
            sum += number;
            printMessage();

        }return sum;
    }
}
