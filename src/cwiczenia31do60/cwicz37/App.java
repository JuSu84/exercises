package cwiczenia31do60.cwicz37;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numbersOfWords = getNumbersOfWords(sc);

        String[] words = new String[numbersOfWords];

        getNextWord(sc, numbersOfWords, words);

        getNewWord(sc, numbersOfWords, words);
    }

    private static void getNewWord(Scanner sc, int numbersOfWords, String[] words) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < numbersOfWords; i++) {
            builder.append(words[i].charAt(words[i].length()-1));
        }
        System.out.println("Nowe słowoto: " + builder);
        sc.close();
    }

    private static void getNextWord(Scanner sc, int numbersOfWords, String[] words) {
        for (int i = 0; i < numbersOfWords; i++) {
            System.out.println("Podaj kolejne słowo");
            words[i] = sc.nextLine();
        }
    }

    private static int getNumbersOfWords(Scanner sc) {
        System.out.println("Podaj liczbę wyrazów");
        int numbersOfWords = sc.nextInt();
        sc.nextLine();
        return numbersOfWords;
    }
}
