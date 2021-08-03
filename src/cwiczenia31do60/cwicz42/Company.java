package cwiczenia31do60.cwicz42;

public class Company {
    private Employee[] employees = {
            new FullTimeEmployee("Jan", "Kowalski", 5000),
            new FullTimeEmployee("Adam", "Nowak", 5000),
            new PartTimeEmployee("Anna", "Pal", 20, 60),
            new PartTimeEmployee("Asia", "Bąk", 40, 75)
    };

    public Employee[] getEmployees() {
        return employees;
    }


    public double totalMonthlySalaries() {
        double totalMonthlySalaries = 0;
        for (Employee employee : employees) {
            totalMonthlySalaries += employee.getMonthlySalary();
        }
        return totalMonthlySalaries;
    }

    public double totalYearlySalaries() {
        double totalYearlySalaries = 0;
        for (Employee employee : employees) {
            totalYearlySalaries += employee.getYearlySalary();
        }
        return totalYearlySalaries;
    }

    public void printEmployees(){
        System.out.println("pracownicy");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
