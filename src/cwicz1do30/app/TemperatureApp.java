package cwicz1do30.app;


public class TemperatureApp {
    public static void main(String[] args) {

        TemperatureReader temperatureReader = new TemperatureReader();

        double actualTemp = temperatureReader.readActualTemp();
        double targetTemp = temperatureReader.readTargetTemp();

        Termostat termostat = new Termostat(actualTemp, targetTemp);

        termostat.changeTemp();

    }
}
