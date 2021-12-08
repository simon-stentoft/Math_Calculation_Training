import javax.imageio.IIOException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {
    Scanner scanner = new Scanner(System.in);

    public String readFiles(String name) {
        MathProblems mathProblems = new MathProblems();

        try {
            File file = new File(name);
            Scanner input = new Scanner(file);
            while (input.hasNextLine()) {
                String data = input.nextLine();
                System.out.println(data);
            }
            input.close();
            mathProblems.getNumberOfTests();
        }
        catch (FileNotFoundException e) {
            System.out.println("No file found.");
            e.printStackTrace();
        }
        return name;
    }
}
