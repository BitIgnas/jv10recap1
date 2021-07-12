package objects.exercise2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount: (100 - 10000)");
        double amount = scanner.nextDouble();

        System.out.println("Enter installment quantity: (6 - 48) ");
        int numberOfInstallments = scanner.nextInt();

        LoanCalculator loanCalculator = new LoanCalculator();
        double loanAmount = loanCalculator.calculateMonthlyInstallmentPrice(amount, numberOfInstallments);

        System.out.printf("Total loan: %.2f", loanAmount);


    }
}
