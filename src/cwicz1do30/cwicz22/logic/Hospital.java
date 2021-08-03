package cwicz1do30.cwicz22.logic;

import cwicz1do30.cwicz22.model.Patient;

import java.util.Scanner;

public class Hospital {

    private Scanner sc = new Scanner(System.in);
    private final int maxNumberPatients = 2;
    private Patient[] patients = new Patient[maxNumberPatients];
    private int actualNumberOfPatients = 0;


    public void addNewPatient(Patient patient) {
        if(actualNumberOfPatients < maxNumberPatients){
            patients[actualNumberOfPatients] = patient;
            actualNumberOfPatients++;
        }else{
            System.out.println("Brak wolnych miejsc na dzisiaj, zapraszamy jutro");
        }
    }

    public void printListOfPatients() {
        for (int i = 0; i < actualNumberOfPatients; i++) {
            System.out.println(patients[i].getFirstName()
            + " " + patients[i].getLastName()
            + " " + patients[i].getPesel());
        }
    }
}
