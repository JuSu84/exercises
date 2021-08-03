package cwicz61do90.cwicz65;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

//Ćwiczenie
//        Stwórz listę 5 imion w losowej kolejności. Korzystając z metody Collections.sort()
//        oraz referencji do metody String.compareToIgnoreCase() posortuj ją w porządku rosnącym,
//        a następnie wyświetl wynik na ekranie.
//
//
//        Podpowiedź
//        W miejsce komparatora metody Collections.sort() możesz przekazać referencję do
//            metody zgodnej z interfejsem Comparator.
public class App {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ania" , "Kasia", "Paweł", "Zbyszek", "Adam");

        names.sort(String::compareToIgnoreCase);
        names.forEach(System.out::println);

    }
}
