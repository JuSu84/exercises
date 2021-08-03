package cwiczenia31do60.cwicz58;
//Ćwiczenie
//        Napisz prostą aplikację do zarządzania pracownikami w firmie. Powinna się ona składać z trzech klas:
//
//        Employee - przechowuje informacje o pracowniku (imię, nazwisko, wypłata),
//        Company - przechowuje informacje o pracownikach w postaci mapy,
//        CompanyApp - pozwala wczytywać dane od użytkownika, wybierać opcje itp.
//        Aplikacja powinna posiadać 3 opcje:
//
//        Dodanie nowego pracownika,
//        wyszukanie informacji o pracowniku na podstawie imienia i nazwiska po czym wyświetlenie
//        danych pracownika na ekranie (imię, nazwisko, wypłata),
//        wyjście z programu.


import java.util.Scanner;

class CompanyApp {
    private static final int ADD_EMPLOYEE = 0;
    private static final int FIND_EMPLOYEE = 1;
    private static final int EXIT = 2;

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Company company = new Company();
        int userOption;
        do {
            printOptions();
            System.out.println("Wybierz opcję:");
            userOption = sc.nextInt();
            sc.nextLine();
            switch (userOption) {
                case ADD_EMPLOYEE:
                    Employee employee = readAndCreateEmployee();
                    company.addEmployee(employee);
                    break;
                case FIND_EMPLOYEE:
                    findEmployee(company);
                    break;
                case EXIT:
                    System.out.println("Papa!");
            }
        } while (userOption != EXIT);
    }

    private static void findEmployee(Company company) {
        System.out.println("Podaj imię:");
        String firstName = sc.nextLine();
        System.out.println("Podaj nazwisko:");
        String lastName = sc.nextLine();
        Employee employee = company.getEmployee(firstName, lastName);
        if (employee == null)
            System.out.println("Brak takiego pracownika");
        else
            System.out.println(employee);
    }

    private static Employee readAndCreateEmployee() {
        System.out.println("Podaj imię:");
        String firstName = sc.nextLine();
        System.out.println("Podaj nazwisko:");
        String lastName = sc.nextLine();
        System.out.println("Podaj wypłatę:");
        double salary = sc.nextDouble();
        sc.nextLine();

        return new Employee(firstName, lastName, salary);
    }

    private static void printOptions() {
        System.out.println(ADD_EMPLOYEE + " - Dodanie pracownika");
        System.out.println(FIND_EMPLOYEE + " - Wyszukiwanie pracownika");
        System.out.println(EXIT + " - Wyjście z programu");
    }
}
