package cwicz61do90.cwicz62;

import java.util.*;

//Ćwiczenie
//        Napisz program, który będzie symulował program typu "totolotek". Napisz klasę Lotto,
//        która przechowuje listę. Powinna posiadać metody:
//
//        generate() - wygeneruje listę liczb od 1 do 49,
//        randomize() - wymiesza elementy na liście (pierwsze sześć liczb na liście będzie wynikiem losowania),
//        checkResult(List<Integer> numbers) - sprawdza ile liczb z listy podanej jako argument pokrywa się z
//        pierwszymi sześcioma elementami losowania (w wyniku zwraca ile liczb było trafionych).
//        Wczytaj od użytkownika sześć liczb i przetestuj działanie aplikacji. Wyświetl wynik losowania,
//        liczby "skreślone" przez użytkownika oraz liczbę trafień.
public class LottoGame {
    public static void main(String[] args) {
        Lotto lotto = new Lotto();
        System.out.println("Witamy w losowaniu LOTTO");
        List<Integer> usersNumbers = readUsersNumbers();
        int result = lotto.checkResult(usersNumbers);
        System.out.println("Wynik losowania: " + lotto.getLottoResult());
        System.out.println("Wytypowane liczby: " + usersNumbers);
        System.out.println("Ilość trafień: " + result);
    }

    private static List<Integer> readUsersNumbers() {
        Scanner input = new Scanner(System.in);
        List<Integer> usersNumbers = new ArrayList<>();
        for (int i = 0; i < Lotto.MAX_NUMBERS; i++) {
            System.out.println("Podaj liczbę od 1 do 49");
            int nextNumber = input.nextInt();
            if(usersNumbers.contains(nextNumber)){
                System.out.println("Podałeś już liczbę " + nextNumber + " podaj inną");
                i--;
            }else if(nextNumber<1 || nextNumber >49){
                System.out.println("Podałeś liczbę " + nextNumber + " z poza zakresu, wybierz od 1 do 49");
                i--;
            }
            else
            usersNumbers.add(nextNumber);
        }
        return usersNumbers;
    }
}
