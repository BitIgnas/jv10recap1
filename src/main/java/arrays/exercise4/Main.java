package arrays.exercise4;

public class Main {
    public static void main(String[] args) {

        Passenger vidas = new Passenger();
        vidas.name = "Vidas";
        vidas.age = 18;

        Passenger nijole = new Passenger();
        nijole.name = "Nijole";
        nijole.age = 21;

        Passenger[] passengers = new Passenger[2];
        passengers[0] = vidas;
        passengers[1] = nijole;

        Bus bus = new Bus();
        bus.destination = "Palanga";
        bus.passengers = passengers;

        Item chair = new Item("Chair", 32, 1);
        Item vase = new Item("Vase", 2, 4);
        Item[] items = new Item[]{chair, vase};

        bus.drivePassengers();
        bus.driveItems(items);


    }
}
