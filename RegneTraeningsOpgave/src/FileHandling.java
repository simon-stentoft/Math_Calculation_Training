import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileHandling {

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
}
