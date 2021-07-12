package practice.oop.practice;

import java.util.Scanner;

public class Console {
    static Scanner scanner = new Scanner(System.in);
    public static double readNumber(String prompt, int min, int max) {
        double value;
        while (true) {
            System.out.print(prompt);
            value = scanner.nextDouble();
            if (value >= min && value <= max) {
                break;
            } else {
                System.out.printf("Enter number between %d and %d", min, max);
            }
        }
        return value;
    }
}
