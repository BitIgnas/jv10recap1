package arrays.exercise3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Car> cars = new ArrayList<>();

        System.out.println("Enter the amount of cars you like to create:");
        int amount = scanner.nextInt();

        for (int i = 0; i < amount; i++) {
            System.out.println("Enter car brand:");
            String brand = scanner.next();

            System.out.println("Enter car model:");
            String model = scanner.next();

            System.out.println("Enter car price:");
            int price = scanner.nextInt();

            Car car = CarFactory.createCar(brand, model, price);
            cars.add(car);
        }

        cars.forEach(s -> System.out.println(s.toString()));
    }
}
