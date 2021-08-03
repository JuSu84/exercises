package cwiczenia31do60.cwicz46;

import java.util.Scanner;

public class Silnia {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę z której chcesz obliczyć silnię");
        int n = scanner.nextInt();

        int factorial = factorial(n);
        System.out.println("Wynik silni dla liczby " + n + " to: " + factorial );
    }

    private static int factorial(int n) {
        return n>1 ? n * factorial(n-1) : 1;
    }
}
