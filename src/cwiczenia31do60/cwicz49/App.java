package cwiczenia31do60.cwicz49;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String word = readWordFromUser();

        int digits = countDigits(word);
        System.out.println("W tekście występuje " + digits + " liczb");

        int letters = countLetters(word);
        System.out.println("W tekście występuje " + letters + " liter");

        try {
            int bigger = biggestNumber(word);
            System.out.println("Największa liczba w tekście to " + bigger);
        } catch (DigitNotFoundException e){
            System.out.println("W tekście nie było żadnej cyfry");
        }
    }

    private static int biggestNumber(String word) {
        char[] chars = word.toCharArray();
        final int notFound = -1;
        int biggestNumber = notFound;
        for (char aChar : chars) {
            if (Character.isDigit(aChar)) {
                int digit = Character.getNumericValue(aChar);
                biggestNumber = Integer.max(biggestNumber, digit);
            }
        }
        if (biggestNumber == notFound)
            throw new DigitNotFoundException();
        return biggestNumber;
    }

    private static int countLetters(String word) {
        char[] chars = word.toCharArray();
        int letters = 0;
        for (char aChar : chars) {
            if (Character.isLetter(aChar)) {
                letters++;
            }
        }
        return letters;
    }

    private static int countDigits(String word) {
        char[] chars = word.toCharArray();
        int digits = 0;
        for (char aChar : chars) {
            if (Character.isDigit(aChar)) {
                digits++;
            }
        }
        return digits;
    }

    private static String readWordFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dowolny napis");
        return scanner.nextLine();
    }


    private static class DigitNotFoundException extends RuntimeException{
    }
}
