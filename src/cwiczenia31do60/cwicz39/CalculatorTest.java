package cwiczenia31do60.cwicz39;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        double a = 0;
        double b = 0;
        String operator = null;
        boolean readComplete = false;

        while (!readComplete) {
            try {
                a = getA(sc);
                operator = getOperator(sc);
                b = getB(sc);
                readComplete = true;
            } catch (InputMismatchException e) {
                System.err.println("Wprowadzono niewłaściwe dane, zacznij jeszcze raz");
                sc.nextLine();
            }
        }
        try {
            double result = Calculator.calculate(a, b, operator);
            System.out.println(a + operator + b + " = " + result);

        } catch (ArithmeticException | UnknownOperatorException e) {
            System.err.println(e.getMessage());
            System.err.println("Nie udało się obliczyć wyrażenia " + a + operator + b);
        }
    }

    private static double getB(Scanner sc) {
        double b;
        System.out.println("Podaj drugą liczbę");
        b = sc.nextDouble();
        sc.nextLine();
        return b;
    }

    private static String getOperator(Scanner sc) {
        String operator;
        System.out.println("Podaj operator arytmetyczny (+, -, *, /");
        operator = sc.nextLine();
        return operator;
    }

    private static double getA(Scanner sc) {
        double a;
        System.out.println("Podaj pierwszą liczbę");
        a = sc.nextDouble();
        sc.nextLine();
        return a;
    }

}
