package cwicz1do30.Cwiczenie10;

import java.util.Random;

public class Dice {
    int a;

    public Dice() {
    }

    public Dice(int a) {
        this.a = a;
    }

    void roll(){
        Random random = new Random();
        this.a = random.nextInt(6) + 1;

    }

    @Override
    public String toString() {
        return "Dice{" +
                "a=" + a +
                '}';
    }
}
