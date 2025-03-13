import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileIO {

    public static void main(String[] args) throws IOException {
        String filePath = "name1.txt";
        String dataToWrite = "Hello,World.";

        // Write to file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("D:/java programs/name1.txt"))) {
            writer.write(dataToWrite);
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.err.println("An error occurred while writing to the file: " + e.getMessage());
        }

        // Read from file
        try (BufferedReader reader = new BufferedReader(new FileReader("D:/java program/name1.txt"))) {
            String line;
            System.out.println("Reading from the file:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("An error occurred while reading from the file: " + e.getMessage());
        }
    }
}