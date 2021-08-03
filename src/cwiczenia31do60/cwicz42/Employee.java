package cwiczenia31do60.cwicz42;

abstract class Employee {
    public static final int NUMBERS_OF_MONTHS = 12;
    private String firstName;
    private String lastName;

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    abstract double getMonthlySalary();
    abstract double getYearlySalary();

    @Override
    public String toString() {
        return firstName + " " + lastName
                + ", miesięczne wynagrodzenie: " + getMonthlySalary()
                + ", roczne wynagrodzenie: " + getYearlySalary();
    }
}
