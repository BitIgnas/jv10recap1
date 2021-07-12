package conditionals.execises;

public class TaskCalculator {

    public  double getTax(double income) {
        double tax = 0;

        if (income < 85528.00) {
            return tax = (income - 556.02) * 0.18;
        } else if (income > 85528.00) {
            return tax = (14839.02 + (income - 85528) * 0.32);
        }

        return tax;
    }
}
