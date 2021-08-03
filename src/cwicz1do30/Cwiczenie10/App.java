package cwicz1do30.Cwiczenie10;

public class App {
    public static void main(String[] args) {
        Dice dice = new Dice();
        Dice dice1 = new Dice(1);

        dice.roll();
        System.out.println(dice.toString());
        dice.roll();
        System.out.println(dice.toString());
        dice.roll();
        System.out.println(dice.toString());
        System.out.println(dice1);


    }
}
