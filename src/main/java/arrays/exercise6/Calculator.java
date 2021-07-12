package arrays.exercise6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculator {

    private static final List<Integer> userNumbers = new ArrayList<>();

    public void userInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number count - ");
        int times = scanner.nextInt();

        for (int i = 0; i < times; i++) {
            System.out.println("Enter you number - ");
            int number = scanner.nextInt();
            userNumbers.add(number);
        }

        scanner.close();
    }

    public double findAverage(List<Integer> numbers) {
        return numbers.stream().mapToDouble(Integer::doubleValue).average().getAsDouble();
    }

    public void calculate() {
        userInput();
        System.out.println(findAverage(userNumbers));
    }
}

