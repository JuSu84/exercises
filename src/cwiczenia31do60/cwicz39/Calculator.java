package cwiczenia31do60.cwicz39;

class Calculator {
    private final static String PLUS = "+";
    private final static String MINUS = "-";
    private final static String MULTIPLY = "*";
    private final static String DIVIDE = "/";
    private String operator;

    static double calculate(double a, double b, String operator) throws UnknownOperatorException {
        double result = 0;
        switch (operator) {
            case PLUS:
                result = a + b;
                break;
            case MINUS:
                result = a - b;
                break;
            case MULTIPLY:
                result = a * b;
                break;
            case DIVIDE:
                if (b == 0) {
                    throw new ArithmeticException("Nie można dzielić przez 0");
                }
                result = a/b;
                break;
            default:
                throw new UnknownOperatorException("Niewłaściwy operator arytmetyczny " + operator);
        }
        return result;
    }
}
