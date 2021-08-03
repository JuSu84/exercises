package przyklady;

import cwiczenia31do60.NoElementFoundExeption;
import cwiczenia31do60.NoMoreSpaceExeption;

public class SchoolTest {
    public static void main(String[] args) {
        School school= new School(3);

        try {
            school.addStudent(new Student(1, "Jan", "Kowalski"));
            school.addStudent(new Student(2, "Adam", "Kowalski"));
        } catch (NoMoreSpaceExeption e) {
            System.err.println(e.getMessage());
        }

        try {
            school.find("Majka", "Kowalska");
        } catch (NoElementFoundExeption noElementFoundExeption) {
            System.err.println(noElementFoundExeption.getMessage());
        }

    }
}
