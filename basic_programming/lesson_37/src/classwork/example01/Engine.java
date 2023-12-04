package classwork.example01;

public class Engine {
    private double consumption;
    private String fuelType;

    public Engine(double consumption, String fuelType) {
        this.consumption = consumption;
        this.fuelType = fuelType;
    }

    public void setConsumption(double consumption) {
        this.consumption = consumption;
    }

    public double getConsumption() {
        return consumption;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void work() {
        System.out.println("(звуки работы двигателя)");
    }
}
