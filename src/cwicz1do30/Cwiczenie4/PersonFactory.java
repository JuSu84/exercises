package cwicz1do30.Cwiczenie4;

public class PersonFactory {

   public Person createPerson(String firstName, String lastName){
        Person person = new Person();
        person.firstName = firstName;
        person.lastName = lastName;
        return person;
    }

}
