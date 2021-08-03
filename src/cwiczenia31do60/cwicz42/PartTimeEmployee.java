package cwiczenia31do60.cwicz42;

public class PartTimeEmployee extends Employee {
    private int hour;
    private double hourlyWage;

    public PartTimeEmployee(String firstName, String lastName, int hour, double hourlyWage) {
        super(firstName, lastName);
        this.hour = hour;
        this.hourlyWage = hourlyWage;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public double getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    @Override
    double getMonthlySalary() {
        return hour * hourlyWage;
    }

    @Override
    double getYearlySalary() {
        return getMonthlySalary() * NUMBERS_OF_MONTHS;
    }
}
