package cwiczenia31do60.cwicz60;

import java.util.Locale;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class TaskManager {

    private Queue<Task> tasks = new PriorityQueue<>();
    static Scanner sc = new Scanner(System.in);

    void mainLoop() {
        Option option;
        do {
            printOptions();
            option = Option.createFromInt(sc.nextInt());
            sc.nextLine();
            switch (option) {
                case ADD:
                    tasks.offer(readAndCreateTask());
                    System.out.println("Zadanie dodane do kolejki");
                    break;
                case TAKE:
                    takeTask();
                    break;
                case EXIT:
                    System.out.println("Koniec programu");
                    break;
            }
        } while (option != Option.EXIT);
    }


    private void takeTask() {
        if (tasks.isEmpty()) {
            System.out.println("Brak zadań do wykonania");
        } else {
            Task nextTask = tasks.poll();
            System.out.println("Zadanie wykonane");
            System.out.println(nextTask);
        }
    }

    private Task readAndCreateTask() {
        System.out.println("Podaj nazwę zadania");
        String name = sc.nextLine();
        System.out.println("Podaj opis zadania");
        String description = sc.nextLine();
        System.out.print("Podaj priorytet zadania ");
        printPriority();
        Task.Priority priority = getPriority();
        return new Task(name, description, priority);
    }

    private void printPriority() {
        for (Task.Priority priority : Task.Priority.values()) {
            System.out.print(priority + " ");
        }
            System.out.println();
    }

    private Task.Priority getPriority() {
        Task.Priority priority = null;
        while (priority == null) {
            try {
                priority = Task.Priority.valueOf(sc.nextLine().toUpperCase(Locale.ROOT));
            } catch (IllegalArgumentException e) {
                System.out.print("Wpisałeś niepoprawny priorytet, spróbój jescze raz ");
                printPriority();
            }
        }
            return priority;
    }

    private void printOptions() {
        Option[] values = Option.values();
        for (Option value : values) {
            System.out.println(value);
        }
    }


    private enum Option {
        ADD(0, "Dodaj zadanie"),
        TAKE(1, "Zrób kolejne zadania"),
        EXIT(2, "Koniec programu");

        int option;
        String description;

        Option(int option, String description) {
            this.option = option;
            this.description = description;
        }

        @Override
        public String toString() {
            return option + " - " + description;
        }

        static Option createFromInt(int option) {
            Option value = null;
            while (value == null){
                try{
                    value = values()[option];
                }catch (ArrayIndexOutOfBoundsException e){
                    System.out.println("wybrałeś niewłaściwą opcje, spróbuj jeszcze raz");
                    option = sc.nextInt();
                }
            }
            return value;
        }
    }
}


