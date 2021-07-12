package objects.exercise2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoanCalculatorTest {

    @Test
    void calculateMonthlyInstallmentPrice() {
        //given
        LoanCalculator loanCalculator = new LoanCalculator();

        //when
        double instPrice =loanCalculator.calculateMonthlyInstallmentPrice(2000, 12);

        //then
        assertEquals(170.8, instPrice);
    }

    @Test
    void calculateMonthlyInstallmentPriceWithDefaultInstallment() {
        //given
        LoanCalculator loanCalculator = new LoanCalculator();

        //when
        double instPrice =loanCalculator.calculateMonthlyInstallmentPrice(2000, 2);

        //then
        assertEquals(61.1, instPrice);
    }
}