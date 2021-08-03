package cwicz1do30.Cwiczenie11.Controller.app;

import cwicz1do30.Cwiczenie11.Controller.PointController;
import cwicz1do30.Cwiczenie11.Data.Point;

import java.util.Scanner;

public class PointApp {
    public static void main(String[] args) {
        Point point = new Point( 3, 5);
        PointController pointController = new PointController();
        Scanner scanner = new Scanner(System.in);

        System.out.println(point);

//        pointController.addX(point);
//        System.out.println(point);
//        pointController.addY(point);
//        System.out.println(point);
//        pointController.minusX(point);
//        System.out.println(point);
//        pointController.minusY(point);
//        System.out.println(point);

        System.out.println("Wybierz opcje 1, 2 lub 3");
        int option = scanner.nextInt();

    switch (option){
        case  0:
            pointController.minusX(point);
            System.out.println(point);
            break;
        case 1:
            pointController.addX(point);
            System.out.println(point);
            break;
        case 2:
            pointController.addX(point);
            pointController.addY(point);
            System.out.println(point);

    }

    }
}
