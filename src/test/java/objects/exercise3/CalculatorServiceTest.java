package objects.exercise3;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceTest {

    private CalculatorService calculatorService;

    @BeforeEach
    void setup() {
        calculatorService = new CalculatorService();
    }
    @Test
    void add() {
        //given
        int num1 = 2;
        int num2 =2;

        //when
        int result = calculatorService.add(num1, num2);

        //then
        assertEquals(4, result);
    }

    @Test
    void subtract() {
        //given
        int num1 = 2;
        int num2 =2;

        //when
        int result = calculatorService.subtract(num1, num2);

        //then
        assertEquals(0, result);
    }

    @Test
    void multiply() {
        //given
        int num1 = 2;
        int num2 =2;

        //when
        int result = calculatorService.multiply(num1, num2);

        //then
        assertEquals(4, result);
    }

    @Test
    void divide() {
        //given
        int num1 = 2;
        int num2 =2;

        //when
        int result = calculatorService.divide(num1, num2);

        //then
        assertEquals(1, result);
    }

    @Test
    void calculateRectangularPerimeter() {
        //given
        int num1 = 2;
        int num2 =2;

        //when
        int result = calculatorService.calculateRectangularPerimeter(num1, num2);

        //then
        assertEquals(8, result);
    }

    @Test
    void calculateRectangularArea() {
        //given
        int num1 = 2;
        int num2 =2;

        //when
        int result = calculatorService.calculateRectangularArea(num1, num2);

        //then
        assertEquals(4, result);
    }
}