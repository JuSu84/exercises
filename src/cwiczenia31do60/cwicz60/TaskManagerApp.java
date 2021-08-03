package cwiczenia31do60.cwicz60;
//Ćwiczenie
//        Napisz program, który będzie pozwalał stworzyć prostą listę To-Do (rzeczy do zrobienia)
//        z możliwością określania priorytetów.
//
//        Do reprezentacji pojedynczych zadań utwórz klasę Task, w której będą pola name (nazwa zadania),
//        description (opcjonalny opis zadania) oraz priority (priorytet) w postaci wartości
//enum przyjmującej wartość LOW, MODERATE lub HIGH.
//
//        W klasie TaskManager dodaj prostą logikę aplikacji, pozwalającą wykonać trzy czynności:
//
//        dodać nowe zadanie,
//        pobrać kolejne zadanie o najwyższym priorytecie do zrobienia,
//        wyjść z aplikacji.
//        Kwestię obsługi wyjątków i nietypowych sytuacji możesz uprościć do minimum lub pominąć.
public class TaskManagerApp {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        taskManager.mainLoop();


    }
}
