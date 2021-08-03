package cwicz61do90.cwicz67;

import java.util.stream.Stream;

//Ćwiczenie
//        Utwórz strumień kolejnych liczb całkowitych zaczynając od 0. Następnie korzystając z metody filter()
//        wybierz tylko te z nich, które są większe od 100, mniejsze od 1000 i podzielne przez 5.
//        Wyświetl na ekranie pierwszych 10 liczb tego strumienia pomnożonych przez 3
//
//        Nie wykorzystuj w programie ani jednej pętli.
public class StreamApp {

    public static void main(String[] args) {
        Stream.iterate(0, n -> n + 1)
                .filter(n -> n > 100 && n <= 1000 && n % 5 == 0)
                .limit(10)
                .map(n -> n * 3)
                .forEach(System.out::println);
    }
}
