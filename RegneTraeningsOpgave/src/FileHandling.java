import javax.imageio.IIOException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {
    Scanner scanner = new Scanner(System.in);

    public String readFiles(String name) {
        try {
            File file = new File(name);
            Scanner input = new Scanner(file);
            while (input.hasNextLine()) {
                String data = input.nextLine();
                System.out.println(data);
            }
            input.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("No file found.");
            e.printStackTrace();
        }
        return name;
    }

    //Creates and appends stuff to files.
    public void createFiles() {
        try {
            if()
            System.out.print("Skriv dit navn: ");
            String name = scanner.nextLine();
            FileWriter file = new FileWriter(name + ".txt", true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
