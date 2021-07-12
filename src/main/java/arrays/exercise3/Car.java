package arrays.exercise3;

public class Car {

    private String brand;
    private String model;
    private int price;

    public Car(String brand, String name, int price) {
        this.brand = brand;
        this.model = name;
        this.price = price;
    }

    public Car() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setName(String name) {
        this.model = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", name='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
