package cwicz1do30.cwicz17;

import java.util.Arrays;

public class ElevatorSymulator {
    public static void main(String[] args) {
        Person p1 = new Person(1, 120);
        Person p2 = new Person(2, 120);
        Person p3 = new Person(3, 120);
        Person p4 = new Person(4, 120);
        Person p5 = new Person(5, 120);


        Evelator evelator = new Evelator();

        for (Person person : Arrays.asList(p1, p2, p3, p4, p5)) {
            evelator.add(person);
        }
        evelator.clear();

        evelator.add(p1);
        evelator.add(p2);
        evelator.add(p3);
        evelator.add(p4);

        evelator.start();
    }


}
