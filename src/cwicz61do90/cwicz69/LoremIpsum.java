package cwicz61do90.cwicz69;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Ćwiczenie
//        W załączniku znajduje się plik z tekstem lorem ipsum. Wczytaj wszystkie słowa osobno do
//            listy słów, a następnie wykorzystując strumienie:
//
//        usuń wszystkie przecinki i kropki doklejone do słów,
//        wyświetl liczbę słów rozpoczynających się literą "s" oraz ile słów składa się z 5 znaków.
public class LoremIpsum {
    public static void main(String[] args) {
        final String fileName = "lorem.txt";

        List<String> words = null;
        try {
            words = readFile(fileName);
            showStats(words);
        } catch (IOException e) {
            System.out.println("Błąd odczytu pliku " + fileName);;
        }
    }

    private static void showStats(List<String> words) {
        long countSWords = words.stream()
                .filter(s -> s.startsWith("s"))
                .peek(System.out::println)
                .count();

        long fiveLetters = words.stream()
                .filter(s -> s.length() == 5)
                .peek(System.out::println)
                .count();

        System.out.println("Liczba wyrazów zaczynających się na literę s " + countSWords);
        System.out.println("Liczba wyrazów 5 literowych " + fiveLetters);
    }

    private static List<String> readFile(String fileName) throws IOException {

        try (var reader = new BufferedReader(new FileReader(fileName))) {
            List<String> words = new ArrayList<>();

            return reader.lines()
                    .map(s -> s.split(" "))
                    .flatMap(Arrays::stream)
                    .map(s -> s.replaceAll(",", "").replaceAll("\\.", ""))
                    .collect(Collectors.toList());
        }

    }
}
