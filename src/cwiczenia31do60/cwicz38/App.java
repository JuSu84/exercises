package cwiczenia31do60.cwicz38;

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String word = readWord(sc);
        System.out.println(newWord(word));
    }

    private static String readWord(Scanner sc) {
        System.out.println("Napisz coś");
        String word = sc.nextLine();
        return word;
    }

    private static String newWord(String word) {
        if(Character.isUpperCase(word.charAt(0))){
            word = word.toUpperCase(Locale.ROOT);
        }else if (Character.isLowerCase(word.charAt(0))){
            word = word.toLowerCase(Locale.ROOT);
        }
        return word;
    }
}
