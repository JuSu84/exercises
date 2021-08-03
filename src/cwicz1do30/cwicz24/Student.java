package cwicz1do30.cwicz24;

public class Student {
    private String firstName;
    private String lastName;
    private String numberOfIndex;
    private static int NUMBER_OF_STUDENTS = 0;

    public Student(String firstName, String lastName, String numberOfIndex) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.numberOfIndex = numberOfIndex;
        NUMBER_OF_STUDENTS ++;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNumberOfIndex() {
        return numberOfIndex;
    }

    public void setNumberOfIndex(String numberOfIndex) {
        this.numberOfIndex = numberOfIndex;
    }

    public static int getNumberOfStudents() {
        return NUMBER_OF_STUDENTS;
    }

    public static void setNumberOfStudents(int numberOfStudents) {
        NUMBER_OF_STUDENTS = numberOfStudents;
    }
}
