package objects.exercise3;

public class CalculatorService {

    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public int divide(int num1, int num2) {
        return num1 / num2;
    }

    public int calculateRectangularPerimeter(int num1, int num2) {
        return (2 * num1) + (2 * num2);
    }

    public int calculateRectangularArea(int num1, int num2) {
        return num1 * num2;
    }

}
