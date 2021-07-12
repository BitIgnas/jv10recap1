package objects.exercise1;

public class LoanCalculator {

    /**
     * Write a program which, based on the variables: amount - amount (double) and number of
     * installments - numberOfInstallments (int), will calculate the monthly loan installment and write it to the console. The parameters have restrictions:
     * the loan amount must be between 100.00 and 10,000.00,
     * the number of installments must be between 6 and 48.
     * If the loan amount exceeds the acceptable range, the loan amount should be set at 5,000.00. If the number of installments exceeds the acceptable range, the number of installments should be set to 36.
     * The calculated monthly installment should also include interest. To simplify the calculations, assume that you add X percent to the loan amount depending on the number of installments:
     * 6-12 installments - 2.5%,
     * 13-24 installments - 5.0%,
     * 25-48 installments - 10.0%,
     * and then calculate the installment amount based on the number of installments.
     * Get the data from the user in the console using the Scanner class.
     */

    private static final double LOW_PERCENTAGE = 0.025;
    private static final double MEDIUM_PERCENTAGE = 0.05;
    private static final double HIGH_PERCENTAGE = 0.1;


    public static double calculateLoan(double amount, int numberOfInstallments) {
        double result = 0;

        if (amount > 100.00 && amount < 10000.00 && numberOfInstallments > 6 && numberOfInstallments < 48) {
            if (numberOfInstallments > 6 && numberOfInstallments < 12) {
                return result = amount * LOW_PERCENTAGE;
            } else if (numberOfInstallments > 13 && numberOfInstallments < 24) {
                return result = amount * MEDIUM_PERCENTAGE;
            } else if (numberOfInstallments > 25 && numberOfInstallments < 48) {
                return result = amount * HIGH_PERCENTAGE;
            }

        } else if (numberOfInstallments > 48 && amount > 10000.00) {
            amount = 5000.00;
            return result = amount * HIGH_PERCENTAGE;

        } else if (amount > 10000.00) {
            amount = 5000.00;

            if (numberOfInstallments > 6 && numberOfInstallments < 12) {
                return result = amount * LOW_PERCENTAGE;
            } else if (numberOfInstallments > 13 && numberOfInstallments < 24) {
                return result = amount * MEDIUM_PERCENTAGE;
            } else if (numberOfInstallments > 25 && numberOfInstallments < 48) {
                return result = amount * HIGH_PERCENTAGE;
            }

        } else if (numberOfInstallments > 48) {
            return result = amount * HIGH_PERCENTAGE;
        } else if (numberOfInstallments > 48 && amount > 10000.00) {
            amount = 5000.00;
            return result = amount * HIGH_PERCENTAGE;
        } else {
            return result;
        }

        return result;
    }
}
