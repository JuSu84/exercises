package cwiczenia31do60.cwicz51;

public class DatabaseTest {
    public static void main(String[] args) {
        PersonDatabase database = new PersonDatabase();
        database.add(new Person("Ania", "Nowak", "123124135"));
        database.add(new Person("Jan", "Kowalski", "64242552"));
        database.add(new Person("Adam", "Słodowy", "62462"));
        database.add(new Person("Jola", "Kij", "5757648452"));

        Person person = database.get(2);
        System.out.println(person);
        System.out.println(database);
        database.remove(new Person("Jan", "Kowalski", "64242552"));
        System.out.println(database);
    }
}
