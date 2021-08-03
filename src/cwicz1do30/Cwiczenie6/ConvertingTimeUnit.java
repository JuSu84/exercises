package cwicz1do30.Cwiczenie6;

public class ConvertingTimeUnit {

    int hourToMinutes(int a) {
        int result = a * 60;
        if (a == 1) {
            System.out.println(a + "godzia to " + result + " minut");
        } else {
            System.out.println(a + " godziny to " + result + " minut");
        }
        return result;
    }

    int minutesToSeconds(int a) {
        int result = a * 60;
        if (a == 1) {
            System.out.println(a + " minuta to " + result + " sekund");
        } else {
            System.out.println(a + " minuty to " + result + " sekund");
        }
        return result;
    }

    int secondsToMiliseconds(int a) {
        int result = a * 1000;
        if (a == 1) {
            System.out.println(a + "sekunda to " + result + " milisekund");
        } else {
            System.out.println(a + " sekundy to " + result + " milisekund");
        }
        return result;
    }
}
