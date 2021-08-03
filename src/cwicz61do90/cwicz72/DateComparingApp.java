package cwicz61do90.cwicz72;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

//Ćwiczenie
//        Napisz program, w którym wczytasz od użytkownika dwie daty, a następnie zrealizuj następujące podpunkty:
//
//        wyświetl informację o tym, która data jest "późniejsza",
//        wyświetl liczbę lat, miesięcy i dni pomiędzy wprowadzonymi datami.
public class DateComparingApp {

    public static void main(String[] args) {
        try {
            LocalDate date1 = readDateFromUser();
            LocalDate date2 = readDateFromUser();
            witchDateIsLater(date1, date2);
            showPeriodBetween(date1, date2);
        } catch (DateTimeParseException e) {
            System.out.println("Podano datę w niewłąściwym formacie");
        }
    }

    private static void showPeriodBetween(LocalDate date1, LocalDate date2) {
        Period between = Period.between(date1, date2);
        int days = Math.abs(between.getDays());
        int month = Math.abs(between.getMonths());
        int year = Math.abs(between.getYears());
        System.out.printf("Podane daty dzieli %d lat, %d miesięcy i %d dni", year, month, days);
    }

    private static void witchDateIsLater(LocalDate date1, LocalDate date2) {
        LocalDate latterDate = date1.isAfter(date2) ? date1 : date2;
        System.out.println("Późniejsza data to: " + latterDate);
    }

    private static LocalDate readDateFromUser() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj datę w formacie yyyy-mm-dd");
        String dateInput = sc.nextLine();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return LocalDate.parse(dateInput, dateTimeFormatter);
    }
}
