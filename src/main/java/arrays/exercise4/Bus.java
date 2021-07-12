package arrays.exercise4;

public class Bus {

    String destination;
    Passenger[] passengers;

    public void drivePassengers() {
        for (int i = 0; i < passengers.length; i++) {
            System.out.println("Driving passenger: " + passengers[i]);
        }
    }

    public void driveItems(Item[] items) {
        for (int i = 0; i < items.length; i++) {
            System.out.println("Driving item: " + items[i]);
        }
    }
}
