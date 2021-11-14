import java.util.Scanner;

public class Regnestykker {

    public static void plusMathProblems1() {
        Scanner scanner = new Scanner(System.in);
        int max = 100;
        int min = 1;
        int range = max - min + 1;
        int right = 0;
        int wrong = 0;
        String proeveResultat;

        System.out.println("Her kommer der nogle plus regnestykker.");

        for (int i = 0; i < 10; i++) {
            int a = (int)(Math.random()* range) + min;
            int b = (int)(Math.random()* range) + min;
            int result = a + b;
            System.out.print("Hvad giver " + a + " + " + b + ": ");
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
        double procentDelRigtig = (((double) right/10) * 100);
        System.out.println("Her er dine resultater: " +
                "\nAntal rigtige: " + right +
                "\nAntal forkerte: " + wrong +
                "\nProcent del rigtige: " + procentDelRigtig + "%" +
                "\nRegneart: Plusstykker" +
                "\nSværhedsgrad: 1");
    }

    public static void plusMathProblems2() {
        Scanner scanner = new Scanner(System.in);
        int max = 100;
        int min = 1;
        int range = max - min + 1;
        int right = 0;
        int wrong = 0;
        String proeveResultat;

        System.out.println("Her kommer der nogle plus regnestykker.");

        for (int i = 0; i < 10; i++) {
            int a = (int)(Math.random()* range) + min;
            int b = (int)(Math.random()* range) + min;
            int c = (int)(Math.random()* range) + min;
            int result = a + b + c;
            System.out.print("Hvad giver " + a + " + " + b + " + " + c + ": ");
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
        double procentDelRigtig = (((double) right/10) * 100);
        System.out.println("Her er dine resultater: " +
                "\nAntal rigtige: " + right +
                "\nAntal forkerte: " + wrong +
                "\nProcent del rigtige: " + procentDelRigtig + "%" +
                "\nRegneart: Plusstykker" +
                "\nSværhedsgrad: 2");
    }

    public static void minusMathProblems1() {
        Scanner scanner = new Scanner(System.in);
        int max = 100;
        int min = 1;
        int range = max - min + 1;
        int right = 0;
        int wrong = 0;
        String proeveResultat;

        System.out.println("Her kommer der nogle minus regnestykker.");

        for (int i = 0; i < 10; i++) {
            int a = (int)(Math.random()* range) + min;
            int b = (int)(Math.random()* range) + min;
            int result = a - b;
            System.out.print("Hvad giver " + a + " - " + b + ": ");
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
        double procentDelRigtig = (((double) right/10) * 100);
        System.out.println("Her er dine resultater: " +
                "\nAntal rigtige: " + right +
                "\nAntal forkerte: " + wrong +
                "\nProcent del rigtige: " + procentDelRigtig + "%" +
                "\nRegneart: Minusstykker" +
                "\nSværhedsgrad: 1");
    }

    public static void minusMathProblems2() {
        Scanner scanner = new Scanner(System.in);
        int max = 100;
        int min = 1;
        int range = max - min + 1;
        int right = 0;
        int wrong = 0;
        String proeveResultat;

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
        double procentDelRigtig = (((double) right/10) * 100);
        System.out.println("Her er dine resultater: " +
                "\nAntal rigtige: " + right +
                "\nAntal forkerte: " + wrong +
                "\nProcent del rigtige: " + procentDelRigtig + "%" +
                "\nRegneart: Minusstykker" +
                "\nSværhedsgrad: 2");
    }
}
