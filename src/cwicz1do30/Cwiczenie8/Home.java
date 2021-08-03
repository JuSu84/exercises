package cwicz1do30.Cwiczenie8;

public class Home {

    double waterCondition;
    double oilCondition;

    public Home(double waterCondition, double oilCondition) {
        this.waterCondition = waterCondition;
        this.oilCondition = oilCondition;
    }

    void takeShower() {
        waterCondition -= 48;
        System.out.println("Bierzemy prysznic");
    }

    void takeBath() {
        waterCondition -= 86;
        System.out.println("Bierzemy kąpiel");
    }

    void makeDiner() {
        waterCondition = waterCondition - 4;
        oilCondition -= 0.1;
        System.out.println("Gotujemy obiad");
    }

    void boilWater() {
         waterCondition -= 0.5;
         oilCondition -= 0.05;
        System.out.println("Gotujemy wodę");
    }

    double watchTv(int hour, double oilCond) {
        oilCondition = oilCond - (hour * 0.06);
        System.out.println("Oglądamy TV");
        return oilCondition;
    }

    void toPrint() {
        System.out.println("Ilość wody: " + waterCondition +
                " litrów, ropa " + oilCondition + " litrów");
    }
}
