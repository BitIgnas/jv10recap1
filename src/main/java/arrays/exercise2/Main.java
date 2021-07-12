package arrays.exercise2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("array size: ");
        int arraySize = scanner.nextInt();

        int[] numberArray = new int[arraySize];
        int sum;


        for (int i = 0; i < numberArray.length; i++) {
            System.out.println(i + 1 + " number");
            numberArray[i] = scanner.nextInt();
        }

        Arrays.stream(numberArray).forEach(s -> System.out.print(s + " "));
        System.out.printf("\nTotal sum: %d", Arrays.stream(numberArray).sum());;
    }
}
