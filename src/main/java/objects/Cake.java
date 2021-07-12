package objects;

public class Cake {

    private String name;
    private double weight;
    private boolean isVegan;
    private double price;

    public Cake(String name, double weight, boolean isVegan, double price) {
        this.name = name;
        this.weight = weight;
        this.isVegan = isVegan;
        this.price = price;
    }

    public Cake() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isVegan() {
        return isVegan;
    }

    public void setVegan(boolean vegan) {
        isVegan = vegan;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Cake{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", isVegan=" + isVegan +
                ", price=" + price +
                '}';
    }
}
