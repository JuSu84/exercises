package cwicz1do30.cwicz14.client;

public class Client {

    private String firstName;
    private boolean premium;
    private String lastName;

    public Client() {
    }

    public Client(String firstName, boolean premium, String lastName) {
        this.firstName = firstName;
        this.premium = premium;
        this.lastName = lastName;
    }

    public Client(String firstName, boolean premium) {
        this.firstName = firstName;
        this.premium = premium;
    }

    public Client(boolean premium, String lastName) {
        this.premium = premium;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public boolean isPremium() {
        return premium;
    }

    public void setPremium(boolean premium) {
        this.premium = premium;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
