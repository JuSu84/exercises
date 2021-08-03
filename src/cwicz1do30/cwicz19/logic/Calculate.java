package cwicz1do30.cwicz19.logic;

public class Calculate {

    public double calculator(double a, String operator, double b) {
        double result = 0;
        switch (operator) {

            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                result = a / b;
                break;
            default:
                System.out.println("Podany operator nie istnieje");
        }
        return result;
    }

}
