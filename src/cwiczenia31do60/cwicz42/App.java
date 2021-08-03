package cwiczenia31do60.cwicz42;

public class App {

    public static void main(String[] args) {
        Company company = new Company();

       company.printEmployees();
        System.out.println("Suma miesięcznych wynagrodzeń: " + company.totalMonthlySalaries());
        System.out.println("Suma rocznych wynagrodzeń: " + company.totalYearlySalaries());
    }
}
