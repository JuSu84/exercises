package cwiczenia31do60.cwicz56;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

//Ćwiczenie
//        W załączonym pliku namespl.txt znajduje się lista imion, każde w nowej linii.
//        Problem w tym, że imiona się powtarzają, a my w programie będziemy potrzebowali jedynie unikalnych imion.
//        Dodatkowo chcielibyśmy, aby imiona były automatycznie posortowane w kolejności odwrotnej
//        niż alfabetyczna (właściwie prawie alfabetyczna, bierzemy pod uwagę kody unikodu danych znaków).
//
//        Po wybraniu odpowiedniego zbioru danych, wyświetl na ekranie liczbę unikalnych imion,
//        a także pierwszy i ostatni element zbioru.
public class App {

    public static void main(String[] args)  {
        final String fileName = "namespl.txt";

        TreeSet<String> treeSet = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return -o1.compareToIgnoreCase(o2);
            }
        });

        try (Scanner sc = new Scanner(new File(fileName))) {
            while (sc.hasNextLine()) {
                treeSet.add(sc.nextLine());
            }
            System.out.println("ilość elementów na liście: " + treeSet.size());
            System.out.println("pierwsze imię na liśćie to " + treeSet.first());
            System.out.println("ostatnie imię na liśćie to " + treeSet.last());
        } catch (FileNotFoundException e) {
            System.err.println("Brak pliku o nazwie " + fileName);
        }

    }
}
