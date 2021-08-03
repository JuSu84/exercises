package cwiczenia31do60.cwicz41.model;

import cwiczenia31do60.cwicz41.Shape;

public class Rectangle implements Shape {
    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public double calculateArea() {
        return a * b;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * a + 2 * b;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Prostokąt, ");
        builder.append("bok A " + a + ", ");
        builder.append("bok B " + b + ", ");
        builder.append("pole: " + calculateArea() + ", ");
        builder.append("obwód: " + calculatePerimeter());
        return builder.toString();
    }
}
