package cwicz1do30.Cwiczenie9;

public class App {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println(calculator.add(3, 5));
        System.out.println(calculator.add(2, 3, 4));
        System.out.println(calculator.substract(5,4));
        System.out.println(calculator.substract(5,3,2));
    }
}
