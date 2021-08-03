package cwicz1do30.Cwiczenie5;

public class Calculate {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        double x = 3.5;
        double y = 1.3;

        System.out.println(calculator.add(x, y));
        System.out.println(calculator.substract(x, y));
        System.out.println(calculator.myltiply(x, y));
        System.out.println(calculator.divide(x, y));
    }
}
