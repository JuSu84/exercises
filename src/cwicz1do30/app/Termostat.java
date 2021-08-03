package cwicz1do30.app;

public class Termostat {

    private double actualTemp;
    private double targetTemp;

    public Termostat(double actualTemp, double targetTemp) {
        this.actualTemp = actualTemp;
        this.targetTemp = targetTemp;
    }

    public double getActualTemp() {
        return actualTemp;
    }

    public void setActualTemp(double actualTemp) {
        this.actualTemp = actualTemp;
    }

    public double getTargetTemp() {
        return targetTemp;
    }

    public void setTargetTemp(int targetTemp) {
        this.targetTemp = targetTemp;
    }

    public void changeTemp() {

        while (targetTempReached()) {
            printInfo(actualTemp);
            if (actualTemp <= targetTemp) {
                actualTemp += 0.5;
            } else {
                actualTemp -= 0.5;
            }
        }
        System.out.println("Osiągnięto temperature docelową " + actualTemp);;
    }

    private boolean targetTempReached() {
        return actualTemp != targetTemp;
    }

    private static void printInfo(double actualTemp) {
        System.out.println("Aktualna temperatura wynosi: " + actualTemp);
    }
}
