package arrays.exercise4;

public class Item {

    String name;
    int weight;
    int quantity;

    public Item(String name, int weight, int quantity) {
        this.name = name;
        this.weight = weight;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", quantity=" + quantity +
                '}';
    }
}
