package cwicz1do30.Cwiczenie8;

public class App {
    public static void main(String[] args) {
        Home home = new Home(10000.0, 8000.0);

        home.toPrint();
        home.takeShower();
        home.toPrint();
        home.takeBath();
        home.toPrint();
        home.boilWater();
        home.toPrint();
        home.makeDiner();
        home.toPrint();
        home.watchTv(2, home.oilCondition);
        home.toPrint();


    }
}
