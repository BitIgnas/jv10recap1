package objects.exercise3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CalculatorService calculatorService = new CalculatorService();

        Scanner scanner = new Scanner(System.in);
        char continueTo = 'y';

       while (continueTo == 'y') {
           System.out.println("Enter first number: ");
           int num1 = scanner.nextInt();

           System.out.println("Enter calculation method: ");
           char method = scanner.next().charAt(0);

           System.out.println("Enter second number: ");
           int num2 = scanner.nextInt();

           switch (method) {
               case '+':
                   System.out.println("Result: " + calculatorService.add(num1, num2));
                   break;

               case '-':
                   System.out.println("Result: " + calculatorService.subtract(num1, num2));
                   break;

               case '*':
                   System.out.println("Result: " + calculatorService.multiply(num1, num2));
                   break;

               case '/':
                   System.out.println("Result: " + calculatorService.divide(num1, num2));
                   break;

               case 'p':
                   System.out.println("Result: " + calculatorService.calculateRectangularPerimeter(num1, num2));
                   break;

               case 'a':
                   System.out.println("Result: " + calculatorService.calculateRectangularArea(num1, num2));
                   break;
           }

           System.out.println("Continue? (y/n)");
           continueTo = scanner.next().charAt(0);

       }

    }
}
