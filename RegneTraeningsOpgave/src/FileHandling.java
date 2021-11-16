import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileHandling {

    public static String readFiles(String name) {
        try {
            File file = new File(name);
            Scanner input = new Scanner(file);

            while (input.hasNext()) {

            }
        }
        catch (FileNotFoundException e) {
            System.out.println("No file found.");
            e.printStackTrace();
        }
        return name;
    }
}
