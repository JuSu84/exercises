package cwicz1do30.Cwiczenie6;

public class ConvertingMetricUnits {

    int metrToCentymetr(int a) {
        int result = a * 100;
        if (a == 1) {
            System.out.println(a + " metr to " + result + " centymetrów");
        } else {
            System.out.println(a + " metry to " + result + " centymetrów");
        }
        return result;
    }

    int metrToMilimetr(int a) {
        int result = a * 1000;
        if (a == 1) {
            System.out.println(a + " metr to " + result + " milimetrów");
        } else {
            System.out.println(a + " metry to " + result + " milimetrów");
        }
        return result;
    }

    double centymetrToMetr(int a) {
        double result = a / 100;
        if (a == 1) {
            System.out.println(a + " centymetr to " + result + " metrów");
        } else {
            System.out.println(a + " centymetry to " + result + " metrów");
        }
        return result;
    }

    double milimetrToMetr(int a) {
        double result = a / 1000;
        if (a == 1) {
            System.out.println(a + " milimetr to " + result + " metrów");
        } else {
            System.out.println(a + " milimetry to " + result + " metrów");
        }
        return result;
    }
}
