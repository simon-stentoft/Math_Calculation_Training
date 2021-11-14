import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Regnestykker regnestykker = new Regnestykker();

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Hvilken sværhedsgrad vil du vælge (1 er nemmere end 2). Indtast 1 eller 2: ");
            String input = scanner.nextLine();
            if (input.equals("1")) {
                System.out.println("Du har valgt sværhedsgrad 1.");
                System.out.print("Vælg nu hvilken regneart du vil øve dig i. Skriv plus eller minus: ");
                String input2 = scanner.nextLine();
                if (input2.equals("plus") || input2.equals("Plus")) {
                    regnestykker.plusMathProblems1();
                }
                if (input2.equals("minus") || input2.equals("Minus")) {
                    regnestykker.minusMathProblems1();
                }
            }
            if (input.equals("2")) {
                System.out.println("Du har valgt sværhedsgrad 2.");
                System.out.print("Vælg nu hvilken regneart du vil øve dig i. Skriv plus eller minus: ");
                String input2 = scanner.nextLine();
                if (input2.equals("plus") || input2.equals("Plus")) {
                    regnestykker.plusMathProblems2();
                }
                if (input2.equals("minus") || input2.equals("Minus")) {
                    regnestykker.minusMathProblems2();
                }
            }
        }
    }
}
