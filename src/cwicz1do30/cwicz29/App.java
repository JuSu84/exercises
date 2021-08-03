package cwicz1do30.cwicz29;

public class App {

    public static void main(String[] args) {
        Tire tire1 = new Tire(2, "Dębica", "safa", "Zimowe", 17, 265);

        ExhaustPart exhaustPart1 = new ExhaustPart(true);
        ExhaustPart exhaustPart2 = new ExhaustPart(false);

        tire1.printInfo();

    }
}
