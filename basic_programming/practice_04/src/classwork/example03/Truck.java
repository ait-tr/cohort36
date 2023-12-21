package classwork.example03;

public class Truck extends Car {
    private int capacity;


    public Truck(int maxPeopleAmount, int speed, String dateOfManufacture, String brand, String fuelType, int capacity) {
        super(maxPeopleAmount, speed, dateOfManufacture, brand, fuelType);
        this.capacity = capacity;
    }

    @Override
    public void ride() {
        System.out.println("You ride on a truck at " + speed + " km/h with " + capacity + " kg of payload");
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
