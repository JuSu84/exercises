package cwicz1do30.Cwiczenie4;

public class Person {
    String firstName;
    String lastName;
    Address address;


    void printInfo() {
        System.out.println(firstName + " " + lastName);
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}
