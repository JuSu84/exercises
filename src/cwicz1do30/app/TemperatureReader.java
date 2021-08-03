package cwicz1do30.app;

import java.util.Scanner;

public class TemperatureReader {

    Scanner scanner = new Scanner(System.in);

    double readActualTemp() {
        printInfoActualTemp();
        double actualTemp = scanner.nextInt();
        return actualTemp;
    }

    double readTargetTemp() {
        printInfoTargetTemp();
        double targetTemp = scanner.nextInt();
        return targetTemp;
    }

    private void printInfoActualTemp() {
        System.out.println("Podaj Aktualną temperaturę");
    }

    private void printInfoTargetTemp() {
        System.out.println("Podaj temperature docelową");
    }
}
