package cwiczenia31do60.cwicz44;

import java.io.*;
import java.util.Scanner;

public class CompanyApp {

    private static final String FILE_NAME = "employee.info";
    private static final int READ_FROM_USER = 1;
    private static final int READ_FROM_FILE = 2;

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Wprowadź dane od użytkownika: " + READ_FROM_USER);
        System.out.println("Wczytaj dane z pliku: " + READ_FROM_FILE);

        int option = scanner.nextInt();
        scanner.nextLine();

        if (option == READ_FROM_USER) {
            Company company = createCompany();
            writeFile(company);
        } else if (option == READ_FROM_FILE) {
            try {
                Company company = readFile();
                System.out.println(company);
            } catch (IOException | ClassNotFoundException e) {
                System.err.println("Błąd odczytu pliku");
            }
        }
    }

    private static Company readFile() throws IOException, ClassNotFoundException {
        try (
                FileInputStream fis = new FileInputStream(FILE_NAME);
                ObjectInputStream ois = new ObjectInputStream(fis);
        ) {
            return (Company) ois.readObject();
        }
    }

    private static void writeFile(Company company) {
        try (
                var fos = new FileOutputStream(FILE_NAME);
                var oos = new ObjectOutputStream(fos)

        ) {
            oos.writeObject(company);
            System.out.println("Zapisano dane do pliku");
        } catch (IOException e) {
            System.err.println("Błąd zapisu pliku");
        }
    }

    private static Company createCompany() {
        Company company = new Company();
        for (int i = 0; i < Company.MAX_EMPLOYEES; i++) {
            System.out.println("Podaj imię:");
            String firstName = scanner.nextLine();
            System.out.println("Podaj nazwisko:");
            String lastName = scanner.nextLine();
            System.out.println("Podaj wynagrodzenie:");
            double salary = scanner.nextDouble();
            scanner.nextLine();
            company.add(new Employee(firstName, lastName, salary));
        }
        return company;
    }
}
