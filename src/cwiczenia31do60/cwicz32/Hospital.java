package cwiczenia31do60.cwicz32;

public class Hospital {

    private static final int MAX_EMPLOYEES = 3;
    private int employeesNumber = 0;

    private Person[] people = new Person[MAX_EMPLOYEES];

    public void addEmploee(Person person) {
        if (employeesNumber < MAX_EMPLOYEES) {
            people[employeesNumber] = person;
            employeesNumber++;
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void getInfo() {
        for (Person p : people) {
            System.out.println(p);

        }
    }
}
