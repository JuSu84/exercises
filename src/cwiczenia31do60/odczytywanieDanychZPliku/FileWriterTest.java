package cwiczenia31do60.odczytywanieDanychZPliku;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

    public static void main(String[] args) {
        String fileName = "testFile.txt";


        try (
                var fileWriter = new FileWriter(fileName, true);
                var writer = new BufferedWriter(fileWriter);
                ) {
            writer.write("Bolek");
            writer.newLine();
            writer.write("Lolek");
            writer.newLine();
            writer.write("Karolek");
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
