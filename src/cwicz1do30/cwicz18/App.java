package cwicz1do30.cwicz18;

public class App {
    public static void main(String[] args) {
        double[][] tab = {
                {1, 1.5, 2},
                {1.5, 2, 2.5},
                {2, 2.5, 3}
        };
        double result = tab[0][0] * tab[1][1] * tab[2][2] + tab[2][0] * tab[1][1] * tab[0][2];
        System.out.println(result);
        result = (tab[1][0] + tab[1][1] + tab[1][2]) * (tab[0][1] + tab[1][1] + tab[2][1]);
        System.out.println(result);

    }
}
