package cwiczenia31do60.cwicz57;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class ProductManager {
    private static final int ADD_PRODUCT = 0;
    private static final int EXIT = 1;
    private static final int DISCARD_PRODUCT = 0;
    private static final int REPLACE_PRODUCT = 1;

    private Set<Product> products = new HashSet<>();
    private Scanner sc = new Scanner(System.in);

    void mainLoop(){
        int option;
        do{
            printOptions();
            option = readOption();
            evaluateOption(option);
        }while (option != EXIT);

    }

    private void evaluateOption(int option) {
        if (option == 0){
            addNextProduct();
        }else if (option == EXIT){
            printProducts();
        }else {
            System.out.println("Nieznana opcja");
        }
    }

    private void addNextProduct() {
        Product product = createProduct();
        if (products.contains(product)){
            askAndReplaceProduct(product);
        }else {
            addProduct(product);
        }
    }

    private void askAndReplaceProduct(Product product) {
        System.out.println("Znaleiono produkt o takiej samej nazwie, co chcesz zrobic?");
        System.out.println("Pozostaw produkt bez zmian " + DISCARD_PRODUCT);
        System.out.println("Zamień produkty " + REPLACE_PRODUCT);
        int option = sc.nextInt();
        sc.nextLine();
        if (option == REPLACE_PRODUCT){
            products.remove(product);
            addProduct(product);
        }else {
            System.out.println("Pozostawiono produkt bez zmian");
        }
    }

    private Product createProduct() {
        System.out.println("Podaj nazwę produktu");
        String name = sc.nextLine();
        System.out.println("Podaj cenę produktu");
        double price = sc.nextDouble();
        return new Product(name, price);
    }

    private void addProduct(Product product) {
        products.add(product);
        System.out.println("Dodano produkt" +
                "");
    }

    private void printProducts() {
        System.out.println("Wszystkie produkty: ");
        for (Product product : products) {
            System.out.println(product);
        }
    }

    private int readOption() {
        int option = sc.nextInt();
        sc.nextLine();
        return option;
    }

    private void printOptions() {
        System.out.println("Dostępne opcje");
        System.out.println("Dodaj produkt " + ADD_PRODUCT);
        System.out.println("Koniec programu " + EXIT);
    }

}