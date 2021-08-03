package cwiczenia31do60.cwicz35;

import java.util.Locale;
import java.util.Scanner;

public class Pizzeria {

    public static void main(String[] args) {

        printPizzas();
        Pizza pizza = getPizza();

        System.out.println("wybrałeś pizze " + pizza.name());
    }

    private static Pizza getPizza() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Wybierz pizze");
        Pizza pizza = Pizza.valueOf(sc.nextLine().toUpperCase(Locale.ROOT));
        sc.close();
        return pizza;
    }

    private static void printPizzas() {
        System.out.println("Dostępne pizze");
        for (Pizza value : Pizza.values()) {
            System.out.println(value);
        }
    }
}
