package cwicz61do90.cwicz71;

import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;
//Ćwiczenie
//        Napisz prosty stoper.
//
//        Wyświetl na ekranie komunikat o tym, że w celu rozpoczęcia pomiaru należy wcisnąć Enter.
//        Następnie na ekranie pojawia się podobny komunikat informujący o tym, że w celu zatrzymania pomiaru
//        należy ponownie wcisnąć Enter.
//
//        Na końcu wyświetl czas jaki udało Ci się zmierzyć w sekundach.

public class StopperApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Wyciśnij enter aby rozpocząć pomiar czasu");
        sc.nextLine();
        Instant start = Instant.now();

        System.out.println("Wyciśnij enter aby zakończyć pomiar czasu");
        sc.nextLine();
        Instant end = Instant.now();

        Duration timeBetween = Duration.between(start, end);
        System.out.println("upłyneło " + timeBetween.getSeconds() + " sekundy" );
    }
}
