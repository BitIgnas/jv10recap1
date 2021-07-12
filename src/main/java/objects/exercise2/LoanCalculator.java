package objects.exercise2;

import java.text.DecimalFormat;

public class LoanCalculator {

    public static final int MIN_LOAN_AMOUNT = 100;
    public static final int MAX_LOAN_AMOUNT = 10000;
    public static final int DEFAULT_LOAN_AMOUNT = 5000;
    public static final int MIN_INSTALLMENTS = 6;
    public static final int MAX_INSTALLMENTS = 48;
    public static final int DEFAULT_INSTALLMENTS = 36;

    public double calculateMonthlyInstallmentPrice(double amount, int installments) {

        //Ternary operator approach
        boolean isAmountEligible = amount > MIN_LOAN_AMOUNT && amount < MAX_LOAN_AMOUNT;
        amount = isAmountEligible ? amount : DEFAULT_LOAN_AMOUNT;

        if(installments < MIN_INSTALLMENTS || installments > MAX_INSTALLMENTS) {
            installments = DEFAULT_INSTALLMENTS;
        }

        double loanInterestRate = getLoanInterestRate(installments);

        return roundTwoDecimals(amount * (1.00 + loanInterestRate) / installments);
    }

    private double getLoanInterestRate(int installments) {
        double loanInterestRate;
        if(installments <= 12) {
            loanInterestRate = 0.025;
        } else if(installments <= 24) {
            loanInterestRate = 0.05;
        } else  {
            loanInterestRate = 0.1;
        }
        return loanInterestRate;
    }

    double roundTwoDecimals(double d) {
        DecimalFormat oneDForm = new DecimalFormat("#.#");
        return Double.valueOf(oneDForm.format(d));
    }

}
