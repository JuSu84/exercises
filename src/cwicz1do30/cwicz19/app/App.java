package cwicz1do30.cwicz19.app;

import cwicz1do30.cwicz19.logic.Calculate;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Wprowadź pierwszą liczbę");
        double firstNumber = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Wybierz działanie: (+, -, *, /");
        String operator = scanner.nextLine();
        System.out.println("Wprowadź drugą liczbę");
        double secondNumber = scanner.nextDouble();

        scanner.close();

        Calculate calculate = new Calculate();
        double result = calculate.calculator(firstNumber, operator, secondNumber);

        System.out.println(firstNumber + operator + secondNumber + " = " + result);
    }


}
