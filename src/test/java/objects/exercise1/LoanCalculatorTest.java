package objects.exercise1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoanCalculatorTest {

    @Test
    void shouldCalculateLoanOutOfBounds() {
        //given
        double amount = 12000;
        int installments = 40;

        //when
        double actual = LoanCalculator.calculateLoan(amount, installments);

        //then
        assertEquals(500.0, actual);
    }

    @Test
    void shouldCalculateValidLoan() {
        //given
        double amount = 1000;
        int installments = 40;

        //when
        double actual = LoanCalculator.calculateLoan(amount, installments);

        //then
        assertEquals(100.0, actual);
    }

    @Test
    void shouldCalculateInValidLoan() {
        //given
        double amount = 10;
        int installments = 2;

        //when
        double actual = LoanCalculator.calculateLoan(amount, installments);

        //then
        assertEquals(0, actual);
    }
}