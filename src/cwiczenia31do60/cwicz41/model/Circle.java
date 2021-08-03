package cwiczenia31do60.cwicz41.model;

import cwiczenia31do60.cwicz41.Shape;

public class Circle implements Shape {
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double calculateArea() {
        return Math.PI * r * r;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * r;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Koło, ");
        builder.append("promień " + r+ ", ");
        builder.append("pole: " + calculateArea()+ ", ");
        builder.append("obwód: " + calculatePerimeter());
        return builder.toString();
    }
}
