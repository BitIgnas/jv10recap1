package conditionals.execises;

import java.util.Scanner;


public class Exercise2 {
    public static void main(String[] args) {
        TaskCalculator taskCalculator = new TaskCalculator();

        Scanner scanner = new Scanner(System.in);
        boolean continueTo = true;
        double tax;

        while (continueTo) {
            System.out.println("Enter your income");
            double income = scanner.nextDouble();

            tax = taskCalculator.getTax(income);
            System.out.println(tax);

            System.out.println("Continue?");
            continueTo = scanner.nextBoolean();

        }

    }
}
