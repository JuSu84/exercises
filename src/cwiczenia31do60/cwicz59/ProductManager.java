package cwiczenia31do60.cwicz59;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ProductManager {

    public static void main(String[] args) {
        try {
            Map<String, TreeSet<Product>> productsMap = ProductImporter.readFile("cwicz59.txt");
            String category = readCategoryFromUser();
            printCategoryStats(productsMap, category);
        } catch (FileNotFoundException e) {
            System.err.println("Brak pliku z danymi produktu");
        }
    }


    private static String readCategoryFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj nazwę kategorii do wyświetlenia");
        return scanner.nextLine();
    }

    private static void printCategoryStats(Map<String, TreeSet<Product>> productsMap, String category) {
        TreeSet<Product> products = productsMap.get(category);

        if (products == null) {
            System.out.println("Brak produktów w danej kategorii");
        } else {
            printAll(products);
            printAvgPrice(products);
            printCheapesAndExpensiveProduct(products);
        }
    }

    private static void printCheapesAndExpensiveProduct(TreeSet<Product> products) {
        System.out.println("Najtańszy produkt kosztuje " + products.first());
        System.out.println("Najdroższy produkt kosztuje " + products.last());
    }

    private static void printAvgPrice(Set<Product> products) {
        double sumPrice = 0;
        for (Product product : products) {
            sumPrice += product.getPrice();
        }
        double avgPrice = sumPrice / products.size();
        System.out.printf("średnia wartość produktów to " + "%.2f", avgPrice);
        System.out.println();
    }

    private static void printAll(Set<Product> products) {
        for (Product product : products) {
            System.out.println(product);
        }
    }
}


