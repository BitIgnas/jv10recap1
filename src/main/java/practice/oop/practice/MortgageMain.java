package practice.oop.practice;

public class MortgageMain {
    final static int MONTHS_IN_YEAR = 12;
    final static int ONE_HUNDRED_PERCENT = 100;
    public static void main(String[] args) {
        int principal = (int) Console.readNumber("Principal (1k - 1M): ", 1_000, 1_000_000);
        double annualInterest = Console.readNumber("Annual interest rate: ", 1, 30);
        int periodInYears = (int) Console.readNumber("Period (years) :", 1, 30);

        MortgageCalculator mortgageCalculator = new MortgageCalculator(principal, annualInterest, periodInYears);
        //MortgageReport mortgageReport = new MortgageReport(mortgageCalculator);
        //mortgageReport.printMortgage(3);
        //mortgageReport.printPaymentSchedule(periodInYears);
    }
}