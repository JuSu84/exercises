package cwicz1do30.cwicz25;

public class App {
    public static void main(String[] args) {


        double x = 0.5;

        System.out.println("0,5 kubka to: " + Measures.calculateCup(x) + " ml");
        System.out.println("0,5 łyżki to: " + Measures.calculateSPOON(x) + " ml");
        System.out.println("0,5 łyżeczki to: " + Measures.calculateTEASPOON(x) + " ml");
    }
}
