package przyklady;

import cwiczenia31do60.NoElementFoundExeption;
import cwiczenia31do60.NoMoreSpaceExeption;

class School {
    private Student[] students;
    private int studentNumber;

    public School(int studentNumber) {
        students = new Student[studentNumber];
    }

    public void addStudent(Student s) throws NoMoreSpaceExeption {
        if (studentNumber >= students.length)
            throw new NoMoreSpaceExeption("Brak miejsca w szkole " + students.length);
            students[studentNumber] = s;
            studentNumber++;
        }

        public Student find (String firstName, String lastName) throws NoElementFoundExeption {
            for (int i = 0; i < studentNumber ; i++) {
                if (students[i].getFirstName().equals(firstName) && students[i].getLastName().equals(lastName)) {
                    return students[i];
                }
            }
            throw new NoElementFoundExeption("Nie znaleziono studenta " + firstName + " " + lastName);
        }
    }
