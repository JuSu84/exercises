package cwicz1do30.Cwiczenie4;

public class Address {
    String street;
    String home;
    int flat;
    String city;
    String postCode;

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
