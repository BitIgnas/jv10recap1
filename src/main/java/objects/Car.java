package objects;

public class Car {

    private String brand;
    private int price;
    private String color;
    private boolean isEngineTurned = false;

    public void turnOnEngine() {
        this.isEngineTurned = true;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", isEngineTurned=" + isEngineTurned +
                '}';
    }
}
