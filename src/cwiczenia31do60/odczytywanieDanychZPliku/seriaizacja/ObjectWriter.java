package cwiczenia31do60.odczytywanieDanychZPliku.seriaizacja;

import java.io.*;

public class ObjectWriter {
    public static void main(String[] args) {
        String fileName = "person.obj";
        Person person = new Person("Jan", "Kowalski");

        try (
                var fs = new FileOutputStream(fileName);
                var os = new ObjectOutputStream(fs);
        ) {
            os.writeObject(person);
            System.out.println("Zapisano obiekt do pliku");
        } catch (IOException e) {
            System.out.println("Błąd zapisu pliku " + fileName);
            e.printStackTrace();
        }
    }
}
