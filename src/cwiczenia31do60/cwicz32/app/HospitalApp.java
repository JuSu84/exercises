package cwiczenia31do60.cwicz32;

public class HospitalApp {

    public static void main(String[] args) {

        Hospital hospital = new Hospital();

        hospital.addEmploee(new Doctor("Jan", "Kowalski", 5000, 1000));
        hospital.addEmploee(new Nurse("Anna", "Nowak", 2500, 10));
        hospital.addEmploee(new Nurse("Anna", "Kwik", 2000, 14));
        hospital.getInfo();

    }
}
