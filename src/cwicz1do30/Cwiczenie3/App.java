package cwicz1do30.Cwiczenie3;

public class App {
    public static void main(String[] args) {

        // Tworzymy 1 osobę
        Person person1 = new Person("Paweł", "Bajda", "840-1502456");

        //Tworzymy konto 1 osoby
        BankAccount bankAccount1 = new BankAccount(person1, 1500);

        //Tworzymy adres 1 osoby
        Address address1 = new Address("Strażacka", 42, 49,
                "Rzeszów", "35-312");
        Address address2 = new Address("Krzyżanowskiego", 23, 15,
                "Rzeszów", "35-354");

        //Tworzymy adres zamieszkania i  zamieszkania 1 osoby (są takie same)
        person1.livingAddress = address1;
        person1.registeredAddress = address1;

        Person person2 = new Person("Asia", "Cieśla", "78103012345");

        BankAccount bankAccount2 = new BankAccount(person2, 5000);

        person2.livingAddress = address1;
        person2.registeredAddress = address2;


        System.out.println("Osoba nr 1: ");
        System.out.println(person1.toString());
        System.out.println("Osoba nr 2: ");
        System.out.println(person2.toString());
    }
}
