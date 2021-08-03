package przyklady;

import java.util.*;

class Tribonacci {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę dla której chcesz obliczyc n-ty element ciągu Tribonacciego");
        int n = scanner.nextInt();

        printTribonacci(n);
    }

    static int tribonacci(int n) {
        if (n == 0 || n == 1 || n == 2)
            return 0;
        if (n == 3)
            return 1;
        else
            return tribonacci(n - 1) + tribonacci(n - 2) + tribonacci(n - 3);
    }

    static void printTribonacci(int n) {
        System.out.println(n + " element ciągu Tribonacciego to: " + tribonacci(n));
        for (int i = 1; i <= n; i++)
            System.out.print(tribonacci(i)
                    + " ");
    }
}
