package cwicz1do30.Cwiczenie6;

public class App {
    public static void main(String[] args) {
        ConvertingMetricUnits metricUnits = new ConvertingMetricUnits();
        ConvertingTimeUnit timeUnit = new ConvertingTimeUnit();

        timeUnit.secondsToMiliseconds(timeUnit.minutesToSeconds(timeUnit.hourToMinutes(14)));
        metricUnits.centymetrToMetr(30);
    }
}
