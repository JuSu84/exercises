package cwiczenia31do60.cwicz41;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;


public class Main {
    public static void main(String[] args) {

        ShapeCalculator shapeCalc = new ShapeCalculator();
        Shape shape = null;

        boolean readComplete = false;

        while (!readComplete) {
            try {
                printOptions();
                shape = shapeCalc.createShape();
                readComplete = true;
            } catch (InputMismatchException e) {
                System.out.println("Podana wartość nie jest liczbą, spróbuj ponownie");
            } catch (NoSuchElementException e) {
                System.out.println("Nie ma elementu o podanym id, spróbuj ponownie");
            } finally {
                shapeCalc.clearBuffer();
            }
        }
        System.out.println(shape);
        shapeCalc.closeScanner();
    }

    private static void printOptions() {
        System.out.println("Wybierz figurę dla której chcesz obliczyć kształt");
        System.out.println(Shape.CIRCLE + " - koło");
        System.out.println(Shape.RECTANGLE + " - prostokąt");
        System.out.println(Shape.TRIANGLE + " - trójkąt");
    }
}
