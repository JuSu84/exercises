package cwiczenia31do60.cwicz52;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        String word1 = readWordFromUser();
        String word2 = readWordFromUser();

        boolean compareResult = isEquals(word1, word2);
        if (compareResult){
            System.out.println("napisy skladają się z tych samych liter");
        }else
            System.out.println("napisy nie skladają się z tych samych liter");
    }

    private static boolean isEquals(String s1, String s2) {
        if (s1 == null && s2 ==null)
            return true;
        if (s1 == null || s2 ==null || s1.length() != s2.length())
            return false;
        char[] chars1 = s1.toLowerCase(Locale.ROOT).toCharArray();
        char[] chars2 = s2.toLowerCase(Locale.ROOT).toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        return Arrays.equals(chars1, chars2);
    }

    private static String readWordFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj jakiś napis");
        return scanner.nextLine();
    }


}
