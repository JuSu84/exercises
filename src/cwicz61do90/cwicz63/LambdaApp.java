package cwicz61do90.cwicz63;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

//Ćwiczenie
//        Napisz aplikację, w której z wykorzystaniem klasy Random i wyrażenia lambda wygenerujesz 10
//        losowych liczb (interfejs Supplier). Wyświetl listę (wszystkie liczby obok siebie,
//        po spacji) na ekranie również wykorzystując wyrażenia lambda (interfejs Consumer).
//
//        Następnie napisz metodę, która usunie z listy wszystkie liczby podzielne przez 2
//        (użyj iteratora i własnej metody wykorzystującej interfejs Predicate).
//
//        Ponownie wyświetl wynik na ekranie.
//
//
//        Podpowiedź
//        Wzoruj się na kodzie przedstawionym w lekcji. Zdefiniuj kilka metod generycznych,
//        które pozwolą wykonać czynności opisane w zadaniu.
public class LambdaApp {
    private static final int MAX_SIZE = 10;

    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> numbers = new ArrayList<>();
//        Supplier<Integer> supplier = () -> random.nextInt(100);
        generateListWhitRandomNumbers(numbers, MAX_SIZE, () -> random.nextInt(100));

        printList(numbers, p -> System.out.print(p + " "));

        removeIfDivisibleByTwo(numbers, p -> p % 2 == 0);
        System.out.println();
        printList(numbers, p -> System.out.print(p + " "));
    }

    private static <T> void removeIfDivisibleByTwo(List<T> list, Predicate<T> predicate) {
        list.removeIf(predicate);
//        Iterator<T> iterator = list.iterator();
//        while (iterator.hasNext()){
//            T next = iterator.next();
//            if (predicate.test(next))
//                iterator.remove();
//        }
    }

    private static <T> void generateListWhitRandomNumbers(List<T> list, int elements, Supplier<T> supplier) {
        for (int i = 0; i < elements; i++)
            list.add(supplier.get());
    }

    private static <T> void printList(List<T> list, Consumer<T> consumer) {
        for (T t : list)
            consumer.accept(t);
    }
}
