package cwicz1do30.Cwiczenie3;

public class Address {
    String street;
    int home;
    int flat;
    String city;
    String postCode;


    public Address(String street, int home, int flat, String city, String postCode) {
        this.street = street;
        this.home = home;
        this.flat = flat;
        this.city = city;
        this.postCode = postCode;
    }

    @Override
    public String toString() {
        return " pod adresem "
                + street +
                " " + home +
                "/" + flat +
                " " + city +
                " " + postCode;
    }
}
