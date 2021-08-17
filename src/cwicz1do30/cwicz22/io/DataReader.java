package cwicz1do30.cwicz22.io;

import cwicz1do30.cwicz22.logic.Hospital;

import java.util.Scanner;

public class DataReader {

    private final Scanner sc = new Scanner(System.in);
    private final int exit = 0;
    private final int add = 1;
    private final int showList = 2;
    private int userChoise = -1;
    Hospital hospital = new Hospital();

    public void showOption() {
        while (userChoise != 0) {
            showMenu();
            userChoise = sc.nextInt();
            sc.nextLine();
            checkChoice();
        }sc.close();
    }

    private void showMenu() {
        System.out.println("Wybierz co chcesz zrobić");
        System.out.println(exit + " - wyjście z programu");
        System.out.println(add + " - dodanie pacjenta");
        System.out.println(showList + " - wyświetlenie listy zapisanych");
    }

    private void checkChoice() {
        switch (userChoise) {
//            case add -> {
//                Patient patient = new Patient();
//                System.out.println("Imię: ");
//                patient.setFirstName(sc.nextLine());
//                System.out.println("Nazwisko: ");
//                patient.setLastName(sc.nextLine());
//                System.out.println("PESEL: ");
//                patient.setPesel(sc.nextLine());
//                hospital.addNewPatient(patient);
//            }
//            case showList -> hospital.printListOfPatients();
//            case exit -> System.out.println("Zamykam program");
//            default -> System.out.println("Wybrana opcja jest niepoprawna");
        }
    }
}


