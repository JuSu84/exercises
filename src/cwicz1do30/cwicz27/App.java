package cwicz1do30.cwicz27;

import java.util.Scanner;

import static cwicz1do30.cwicz27.logic.Logic.orEven;
import static cwicz1do30.cwicz27.logic.Logic.readNumber;

public class App {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        orEven(readNumber(scanner));
    }
}
