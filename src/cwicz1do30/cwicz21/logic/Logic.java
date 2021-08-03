package cwicz1do30.cwicz21.logic;

import java.util.Scanner;

public class Logic {

    private Scanner sc = new Scanner(System.in);
    private int couter = 0;
    private int sum = 0;

    public void showOptions(){
        System.out.println("Podaj ile liczb chcesz zsumować");
        couter = sc.nextInt();
    }

    public void sumNumbers(){

        while (couter > 0) {
            System.out.println("Podaj liczbę");
            sum = sum + sc.nextInt();
            couter--;
        }
        System.out.println("Suma podanych liczb = " + sum);
    }

    public void close(){
        sc.close();
    }
}
