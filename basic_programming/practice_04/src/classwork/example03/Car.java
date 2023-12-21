package classwork.example03;

public class Car extends Vehicle {
    protected String brand;
    protected String fuelType;

    public Car(int maxPeopleAmount, int speed, String dateOfManufacture, String brand, String fuelType) {
        super(maxPeopleAmount, speed, dateOfManufacture);
        this.brand = brand;
        this.fuelType = fuelType;
    }


    @Override
    public void ride() {
        System.out.println("You are riding in a car at " + speed + " km/h");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
}
