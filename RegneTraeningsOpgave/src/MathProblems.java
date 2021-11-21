import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class MathProblems {
    Scanner scanner = new Scanner(System.in);
    FileHandling fileHandling = new FileHandling();

    public void plusMathProblems1() {
        try {
            int max = 100;
            int min = 1;
            int range = max - min + 1;
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
            file.format("Antal rigtige: %d\n",right);
            file.append("Regneart: Plus \n");
            file.append("Sværhedsgrad: 1");
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
            int max = 100;
            int min = 1;
            int range = max - min + 1;
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
            file.write("Antal rigtige: " + right + "\n");
            file.write("Regneart: Plus.\n");
            file.write("Sværhedsgrad 2\n");
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
        try {
            int max = 100;
            int min = 1;
            int range = max - min + 1;
            int right = 0;
            int wrong = 0;

            fileHandling.createFiles();

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
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void minusMathProblems2() {
        int max = 100;
        int min = 1;
        int range = max - min + 1;
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
