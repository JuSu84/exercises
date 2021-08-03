package cwiczenia31do60.cwicz55;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Ćwiczenie
//        Napisz program, w którym będziesz wczytywać od użytkownika liczby tak długo,
//        dopóki spełniają one następujące warunki:
//
//        liczba jest nieujemna,
//        liczba jest podzielna przez 5.
//        W przypadku podania pierwszej liczby, która nie spełnia podanych wyżej kryteriów,
//        wczytywanie liczb powinno zostać przerwane.
//
//        Wyświetl na ekranie:
//
//        liczbę wprowadzonych przez użytkownika liczb, które spełniają podane kryteria,
//        sumę oraz średnią wszystkich wprowadzonych liczb, które spełniają kryteria.
public class CalculateApp {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        List<Double> numbers = new ArrayList<>();
        fillList(numbers);
        System.out.println("Ilość poprawnie wprowadzonych liczb to: " + numbers.size());
        printData(numbers);
    }

    private static void printData(List<Double> list) {
        if (!list.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            double avg = 0;
            double sum = 0;
            for (Double d : list) {
                sb.append(d);
                sb.append('+');
                sum += d;
                avg = sum / list.size();
            }
            sb.replace(sb.length() - 1, sb.length(), "\n");
            sb.append("średnia z podanych liczb = ");
            sb.append(avg);
            sb.append("\n");
            sb.append("Suma podanych liczb = ");
            sb.append(sum);
            System.out.println(sb.toString());
        }
    }

    private static void fillList(List<Double> numbers) {
        System.out.println("Podaj liczbę podzielną przez 5");
        String input = sc.nextLine();

        try {
            Double num = Double.valueOf(input);
            if (num >= 0 && num % 5 == 0)
                numbers.add(num);
            else {
                return;
            }
        } catch (Exception e) {
            System.err.println("Niepoprawny format liczby");
        }
        fillList(numbers);
    }
}
