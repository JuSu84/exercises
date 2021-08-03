package cwicz1do30.cwicz28;

import java.util.Scanner;

public class App {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int multi = getMulti();

        negativeOrPositive(multi);
    }

    private static void negativeOrPositive(int multi) {
        if (multi >= 0)
            System.out.println("Wynik mnożenia podanych liczb = " + multi + " liczba nieujemna");
        else
            System.out.println("Wynik mnożenia podanych liczb = " + multi + " liczba  ujemna");
    }


    private static int getMulti() {
        int index = 0;
        int multi = 1;
        int next = 0;

        while (index < 5) {
            System.out.println("Podaj " + (index + 1) + " liczbę ");
            multi *= next = scanner.nextInt();
            index++;
        }
        return multi;
    }
}
