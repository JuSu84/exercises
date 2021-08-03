package cwiczenia31do60.cwicz50;

public class PairTest {
    public static void main(String[] args) {

    Pair<String, Integer> pair1 = new Pair<>("Ania", 123);
    Pair<Double, Double> pair2 = new Pair<>(23.4, 43.1);
    Pair<String, String> pair3 = new Pair<>("Jan" , "Kowalski");

    printPair(pair1);
    printPair(pair2);
    printPair(pair3);
    }

    private static <T, V> void printPair(Pair<T, V> pair) {
        System.out.println(pair.getT() + " " + pair.getV());
    }
}
