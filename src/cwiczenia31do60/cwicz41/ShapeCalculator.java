package cwiczenia31do60.cwicz41;

import cwiczenia31do60.cwicz41.model.Circle;
import cwiczenia31do60.cwicz41.model.Rectangle;
import cwiczenia31do60.cwicz41.model.Triangle;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class ShapeCalculator {

    Scanner sc = new Scanner(System.in);

    public void closeScanner() {
        sc.close();
    }

    private Rectangle readRectangleData() {
        System.out.println("Podaj dane prostokąta");
        System.out.println("Podaj bok A");
        double a = sc.nextDouble();
        System.out.println("Podaj bok B");
        double b = sc.nextDouble();

        return new Rectangle(a, b);
    }

    private Circle readCircleData() {
        System.out.println("Podaj dane koła");
        System.out.println("Podaj długość promienia");
        double r = sc.nextDouble();

        return new Circle(r);
    }

    private Triangle readTriangleData() {
        System.out.println("Podaj dane trójkąta");
        System.out.println("Podaj bok A");
        double a = sc.nextDouble();
        System.out.println("Podaj bok B");
        double b = sc.nextDouble();
        System.out.println("Podaj bok C");
        double c = sc.nextDouble();
        System.out.println("Podaj wysokość h");
        double h = sc.nextDouble();

        return new Triangle(a, b, c, h);
    }

    public Shape createShape() {
        int shapeType = sc.nextInt();
        switch (shapeType) {
            case Shape.CIRCLE:
                return readCircleData();
            case Shape.RECTANGLE:
                return readRectangleData();
            case Shape.TRIANGLE:
                return readTriangleData();
            default:
                throw new NoSuchElementException();
        }
    }

    public void clearBuffer() {
        sc.nextLine();
    }
}
