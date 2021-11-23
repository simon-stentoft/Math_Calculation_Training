import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class MathProblems {
    Scanner scanner = new Scanner(System.in);
    FileHandling fileHandling = new FileHandling();

    int max = 100;
    int min = 1;
    int range = max - min + 1;
    int numberOfTests = 0;
    int allAnswersCorrect = 0;

    public void plusMathProblems1() {
        try {
            int right = 0;
            int wrong = 0;
            String name;

            System.out.print("Skriv dit navn: ");
            name = scanner.nextLine();
            PrintWriter file = new PrintWriter(name + ".txt");

            System.out.println("Her kommer der nogle plus regnestykker.");

            for (int i = 0; i < 10; i++) {
                int a = (int) (Math.random() * range) + min;
                int b = (int) (Math.random() * range) + min;
                int result = a + b;
                System.out.print("Hvad giver " + a + " + " + b + ": ");
                int input = scanner.nextInt();
                if (input != result) {
                    System.out.println("Du svarede forkert, det korrekte svar er " + result + ".");
                    wrong++;
                } else {
                    System.out.println("Du svarede rigtigt!");
                    right++;
                }
            }
            if (right == 10) {
                allAnswersCorrect++;
            }
            //Writing to file.
            numberOfTests++;
            file.write("\nAntal rigtige: " + right + "\n");
            file.write("Regneart: Plus \n");
            file.write("Sværhedsgrad: 1");
            file.write("Antal tests: " + numberOfTests + "\n");
            file.close();

            double procentRight = (((double) right / 10) * 100);
            System.out.println("Her er dine resultater: " +
                    "\nAntal rigtige: " + right +
                    "\nAntal forkerte: " + wrong +
                    "\nProcent del rigtige: " + procentRight + "%" +
                    "\nRegneart: Plusstykker" +
                    "\nSværhedsgrad: 1");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void plusMathProblems2() {
        try {
            int right = 0;
            int wrong = 0;
            String name;

            System.out.print("Skriv dit navn: ");
            name = scanner.nextLine();
            FileWriter file = new FileWriter(name + ".txt",true);

            System.out.println("Her kommer der nogle plus regnestykker.");

            for (int i = 0; i < 10; i++) {
                int a = (int) (Math.random() * range) + min;
                int b = (int) (Math.random() * range) + min;
                int c = (int) (Math.random() * range) + min;
                int result = a + b + c;
                System.out.print("Hvad giver " + a + " + " + b + " + " + c + ": ");
                int input = scanner.nextInt();
                if (input != result) {
                    System.out.println("Du svarede forkert, det korrekte svar er " + result + ".");
                    wrong++;
                } else {
                    System.out.println("Du svarede rigtigt!");
                    right++;
                }
            }
            if (right == 10) {
                numberOfTests++;
            }
            //Writing to file.
            numberOfTests++;
            file.write("\nAntal rigtige: " + right + "\n");
            file.write("Regneart: Plus.\n");
            file.write("Sværhedsgrad 2\n");
            file.write("Antal tests: " + numberOfTests + "\n");
            file.close();

            double procentRight = (((double) right / 10) * 100);
            System.out.println("Her er dine resultater: " +
                    "\nAntal rigtige: " + right +
                    "\nAntal forkerte: " + wrong +
                    "\nProcent del rigtige: " + procentRight + "%" +
                    "\nRegneart: Plusstykker" +
                    "\nSværhedsgrad: 2");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void minusMathProblems1() {
      //  try {
            int right = 0;
            int wrong = 0;

            System.out.println("Her kommer der nogle minus regnestykker.");

            for (int i = 0; i < 10; i++) {
                int a = (int) (Math.random() * range) + min;
                int b = (int) (Math.random() * range) + min;
                int result = a - b;
                System.out.print("Hvad giver " + a + " - " + b + ": ");
                int input = scanner.nextInt();
                if (input != result) {
                    System.out.println("Du svarede forkert, det korrekte svar er " + result + ".");
                    wrong++;
                } else {
                    System.out.println("Du svarede rigtigt!");
                    right++;
                }
            }
            double procentRight = (((double) right / 10) * 100);
            System.out.println("Her er dine resultater: " +
                    "\nAntal rigtige: " + right +
                    "\nAntal forkerte: " + wrong +
                    "\nProcent del rigtige: " + procentRight + "%" +
                    "\nRegneart: Minusstykker" +
                    "\nSværhedsgrad: 1");
       /* } catch (IOException e) {
            e.printStackTrace();
        }*/
    }

    public void minusMathProblems2() {
        int right = 0;
        int wrong = 0;

        System.out.println("Her kommer der nogle minus regnestykker.");

        for (int i = 0; i < 10; i++) {
            int a = (int)(Math.random()* range) + min;
            int b = (int)(Math.random()* range) + min;
            int c = (int)(Math.random()* range) + min;
            int result = a - b - c;
            System.out.print("Hvad giver " + a + " - " + b + " - " + c + ": ");
            int input = scanner.nextInt();
            if (input != result) {
                System.out.println("Du svarede forkert, det korrekte svar er " + result + ".");
                wrong++;
            }
            else {
                System.out.println("Du svarede rigtigt!");
                right++;
            }
        }
        double procentRight = (((double) right/10) * 100);
        System.out.println("Her er dine resultater: " +
                "\nAntal rigtige: " + right +
                "\nAntal forkerte: " + wrong +
                "\nProcent del rigtige: " + procentRight + "%" +
                "\nRegneart: Minusstykker" +
                "\nSværhedsgrad: 2");
    }
}
