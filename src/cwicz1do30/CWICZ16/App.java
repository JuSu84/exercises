package cwicz1do30.CWICZ16;



public class App {

    public static void main(String[] args) {

        int[] tab1 = {1, 3, 6};
        int[] tab2 = {12, 34, 53};

        ArrayUtils utils = new ArrayUtils();

        System.out.println("Suma tab1: " + utils.sumArray(tab1));
        System.out.println("Suma tab2: " + utils.sumArray(tab2));

        System.out.println("Suma tab1 + tab2: " + utils.sumArrays(tab1, tab2));
    }
}
