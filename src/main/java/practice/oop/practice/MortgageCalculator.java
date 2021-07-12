package practice.oop.practice;

import java.text.NumberFormat;

public class MortgageCalculator {
    private final int principal;
    private final double annualInterest;
    private final int periodInYears;

    private final static int MONTHS_IN_YEAR = 12;
    private final static int ONE_HUNDRED_PERCENT = 100;

    public MortgageCalculator(int principal, double annualInterest, int periodInYears) {
        this.principal = principal;
        this.annualInterest = annualInterest;
        this.periodInYears = periodInYears;
    }


    public double calculateBalance(
            int principal, double annualInterest, int periodInYears, int numberOfPaymentsMade) {
        int numberOfPayments = getNumberOfPayments();
        double monthlyInterest = getMonthlyInterest();
        return this.principal
                * (Math.pow(1 + monthlyInterest, numberOfPayments) - Math.pow(1 + monthlyInterest, numberOfPaymentsMade))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
    }

    public double calculateMortgage() {
        int numberOfPayments = getNumberOfPayments();
        double monthlyInterest = getMonthlyInterest();
        double mortgage = principal
                * monthlyInterest * Math.pow((1 + monthlyInterest), numberOfPayments)
                / (Math.pow((1 + monthlyInterest), numberOfPayments) - 1);
        return mortgage;
    }

    public double[] getRemainingBalances() {
        double[] balances = new double[getNumberOfPayments()];
        for (int month = 1; month <= periodInYears * MortgageMain.MONTHS_IN_YEAR; month++) {
            balances[month - 1] = calculateBalance(principal, annualInterest, periodInYears, month);
        }
        return balances;
    }

    private int getNumberOfPayments() {
        return periodInYears * MONTHS_IN_YEAR;
    }

    private double getMonthlyInterest() {
        return this.annualInterest / ONE_HUNDRED_PERCENT / MONTHS_IN_YEAR;
    }
}
