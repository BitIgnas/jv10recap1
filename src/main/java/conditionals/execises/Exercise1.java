package conditionals.execises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueTo = true;

        while (continueTo) {
            System.out.println("Enter person height: ");
            int height = scanner.nextInt();

            System.out.println("Enter person weight");
            int weight = scanner.nextInt();

            if (height > 150 && weight < 180) {
                System.out.println("Fasten your seatbelt");
            } else {
                System.out.println("You can't go");
            }

            System.out.println("Continue?");
            continueTo = scanner.nextBoolean();
        }
    }
}
