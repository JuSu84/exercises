package cwiczenia31do60.cwicz54;
//Ćwiczenie
//        Napisz program, który pozwoli zsumować dowolną ilość liczb od użytkownika.
//        Aplikacja powinna przerwać wczytywanie liczb, gdy użytkownik wprowadzi polecenie "exit".
//
//        Po wczytaniu liczb wyświetl je na ekranie oraz podaj wynik ich sumowania w postaci
//        "a + b + c + ... + N = wynik". Do wczytywania danych napisz odpowiednią metodę rekurencyjną.
//        Podpowiedź
//        Zdefiniuj pętlę, w której wykorzystasz metodę equals() do sprawdzenia,
//        czy użytkownik wpisał "exit", czy inną wartość. Od użytkownika wczytuj napisy, a późnij przekształcaj je na liczby używając odpowiednich metod z klas opakowujących.
//
//        Zastanów się nad obsługą wyjątków, np. gdy użytkownik wpisze "abc",
//        to przy próbie zamiany takiego napisu na liczbę otrzymasz wyjątek.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumNumbers {
    private static Scanner sc = new Scanner(System.in);
    private static final String EXIT = "exit";

    public static void main(String[] args) {
        List<Double> numbers = new ArrayList<>();
        fillList(numbers);
        printData(numbers);
    }

    private static void printData(List<Double> list) {
        if (!list.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            double sum = 0;
            for (Double d : list) {
                sb.append(d);
                sb.append('+');
                sum += d;
            }
            sb.replace(sb.length() -1, sb.length(), "=");
            sb.append(sum);
            System.out.println(sb.toString());
        }
    }

    private static void fillList(List<Double> numbers) {
        System.out.println("Podaj liczbę lub wpisz 'exit' żeby wyjść");
        String input = sc.nextLine();
        if (input.equalsIgnoreCase(EXIT))
            return;
        try {
            Double num = Double.valueOf(input);
            numbers.add(num);
        } catch (NumberFormatException e) {
            System.err.println("Nieprawidowy format danych, wpisz liczbę");
        }
        fillList(numbers);
    }

}
