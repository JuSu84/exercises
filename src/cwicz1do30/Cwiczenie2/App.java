package cwicz1do30.Cwiczenie2;

public class App {
    public static void main(String[] args) {

        Plant plant1 = new Plant("paprotka", "lisciasta", 0.7);
        Plant plant2 = new Plant("storczyk", "lisciasta", 0.3);
        Plant plant3 = new Plant("kaktus", "kaktus", 0.1);

        double dailyWaterConsumption = plant1.getWaterDemand()
                + plant2.getWaterDemand() + plant3.getWaterDemand();
        double weeklyWaterConsumption = dailyWaterConsumption * 7;
        double yearlyWaterConsumption = dailyWaterConsumption * 365;

        System.out.println("Dzienne zużycie wody przez wszystkie rośliny to: " + dailyWaterConsumption);
        System.out.println("Tygodniowe zużycie wody przez wszystkie rośliny to: " + weeklyWaterConsumption);
        System.out.println("Roczne zużycie wody przez wszystkie rośliny to: " + yearlyWaterConsumption);

    }

}
