package objects.exercise1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueTo = true;

        while(continueTo) {
            System.out.println("amount:");
            double amount = scanner.nextDouble();

            System.out.println("installment");
            int installment = scanner.nextInt();

            System.out.printf("Interest: %.1f$\n", LoanCalculator.calculateLoan(amount, installment));

            System.out.println("Continue?");
            continueTo = scanner.nextBoolean();
        }


    }
}
