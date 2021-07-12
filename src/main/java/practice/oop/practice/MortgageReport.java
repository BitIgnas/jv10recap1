package practice.oop.practice;

import java.text.NumberFormat;

public class MortgageReport {

    private final MortgageCalculator mortgageCalculator;

    public MortgageReport(MortgageCalculator mortgageCalculator, NumberFormat currency) {
        this.mortgageCalculator = mortgageCalculator;
    }

    public void printMortgage(double mortgage) {
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("\nMORTGAGE");
        System.out.println("----------");
        System.out.print("Mortgage: " + mortgageFormatted);
    }

    public void printPaymentSchedule(int periodInYears) {
        final int MONTHS_IN_YEAR = 12;

        for (double remainingBalance : mortgageCalculator.getRemainingBalances()) {
            System.out.println(NumberFormat.getCurrencyInstance().format(remainingBalance));
        }
    }
}
