package cwicz1do30.Cwiczenie3;

public class BankAccount {
    Person owner;
    double balance;

    public BankAccount() {
    }

    public BankAccount(Person owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }
}
