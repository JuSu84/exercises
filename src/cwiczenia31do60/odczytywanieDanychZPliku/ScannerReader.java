package cwiczenia31do60.odczytywanieDanychZPliku;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

class ScannerReader {
    public static void main(String[] args) throws FileNotFoundException {
        String fileName = "testFile.txt";
        File file = new File(fileName);
        Scanner scan = new Scanner(file);


        //tworzenie nowego pliku
        boolean exists = file.exists();
        if(!exists){
            try {
                exists = file.createNewFile();
            } catch (IOException e) {
                System.out.println("Nie udało się utworzyć pliku");
            }
        }

        if (exists){
            System.out.println("Plik " + fileName + " isnieje lub został utworzony");
        }

        //odczyt danych z pliku
        int lines = 0;
        while (scan.hasNextLine()) {
            String name = scan.nextLine();
            System.out.println(name);
            lines++;
        }
        System.out.println("Ilość wierszy w pliku: " + lines);
        scan.close();
    }
}
