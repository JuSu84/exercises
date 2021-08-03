package cwicz1do30.cwicz13.number;

public class NumberUtils {

    private int x;


    public void compareNumberAndPrint(int number, int compareTo) {
        if (number < compareTo)
            System.out.println(number + " Liczba jest mniejsza od " + compareTo);
        else if (number == compareTo)
            System.out.println(number + " Liczba jest równa " + compareTo);
        else
            System.out.println(number + " Liczba jest większa od " + compareTo);
    }

    public int metoda2(int number) {
        if (number / 1000 != 0)
            return number;
        else if (number / 100 != 0)
            return number * 10;
        else if (number / 10 != 0)
            return number * 100;
        else
            return number * 1000;
    }

    public void parzysta(int number) {
        if (number == 0)
            System.out.println("Liczba jest równa " + 0);
        else if (number % 2 == 0)
            System.out.println("Liczba " + number + " jest parzysta");
        else
            System.out.println("Liczba " + number + " jest nieparzysta");
    }


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return "Liczba " +
                "x = " + x;
    }
}
