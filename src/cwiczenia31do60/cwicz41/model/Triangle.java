package cwiczenia31do60.cwicz41.model;

import cwiczenia31do60.cwicz41.Shape;

public class Triangle implements Shape {
    private double a;
    private double b;
    private double c;
    private double height;

    public Triangle(double a, double b, double c, double height) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.height = height;
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

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return a * height / 2;
    }

    @Override
    public double calculatePerimeter() {
        return 3 * a;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Prostokąt, ");
        builder.append("bok A " + a + ", ");
        builder.append("wysokość h " + height + ", ");
        builder.append("pole: " + calculateArea() + ", ");
        builder.append("obwód: " + calculatePerimeter());
        return builder.toString();
    }
}
