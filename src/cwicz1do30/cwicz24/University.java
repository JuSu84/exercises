package cwicz1do30.cwicz24;

public class University {
    public static void main(String[] args) {
        System.out.println("Liczba studentów przed zapisaniem: " + Student.getNumberOfStudents());
        Student student1 = new Student("Paweł", "Bajda", "12314");
        Student student2 = new Student("Jan", "Nowak", "12314");

        System.out.println("Liczba studentów po zapisaniu: " + Student.getNumberOfStudents());

    }

}
