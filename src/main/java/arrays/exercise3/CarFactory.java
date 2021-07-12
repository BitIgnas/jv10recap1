package arrays.exercise3;

public class CarFactory {

    public static Car createCar(String brand, String name, int price) {
        Car car = new Car();
        car.setBrand(brand);
        car.setName(name);
        car.setPrice(price);

        return car;
    }
}
