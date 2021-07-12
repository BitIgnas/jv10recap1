package conditionals.execises;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class TaskCalculatorTest {

    private static TaskCalculator taskCalculator;

    @BeforeAll
    static void setup() {
        taskCalculator = new TaskCalculator();
    }

    @Test
    void shouldCalculateTax() {
        //given
        double tax = 20000;

        //when
        double calculateTax = taskCalculator.getTax(tax);

        //then
        assertEquals(3499.9163999999996, calculateTax);

    }

    @Test
    void shouldCalculateTaxIsAboveMargin() {
        //given
        double tax = 100000;

        //when
        double calculateTax = taskCalculator.getTax(tax);

        //then
        assertEquals(19470.06, calculateTax);
    }






}