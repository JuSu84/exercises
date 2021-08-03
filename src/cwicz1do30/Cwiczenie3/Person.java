package cwicz1do30.Cwiczenie3;

public class Person {
    String firstName;
    String lastName;
    String pesel;
    Address livingAddress;
    Address registeredAddress;

    public Person(String firstName, String lastName, String pesel) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pesel = pesel;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + "\nPesel " + pesel
                + "\nMieszka" + livingAddress + "\nZameldowana/y" + registeredAddress;
    }
}
