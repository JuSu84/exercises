package cwiczenia31do60.cwicz42;

public class FullTimeEmployee extends Employee {
    private final static double YEARLY_BONUS = 0.05;
    private double salary;

    public FullTimeEmployee(String firstName, String lastName, double salary) {
        super(firstName, lastName);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    double getMonthlySalary() {
        return salary;
    }

    @Override
    double getYearlySalary() {
        double yearlySalary = salary * NUMBERS_OF_MONTHS;
        double yearlyBonus = yearlySalary * YEARLY_BONUS;
        return yearlySalary + yearlyBonus;
    }
}
