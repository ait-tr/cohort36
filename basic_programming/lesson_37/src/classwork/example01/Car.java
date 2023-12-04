package classwork.example01;

public class Car {
    private double fuelAmount;
    private final double maxFuel;
    private String model;
    private Engine engine;

    public Car(String model, double maxFuel, double consumption, String fuelType) {
        this.model = model;
        this.maxFuel = maxFuel;
        this.fuelAmount = maxFuel;
        this.engine = new Engine(consumption, fuelType);
    }

    public double getMaxFuel() {
        return maxFuel;
    }

    public double getFuelAmount() {
        return fuelAmount;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setConsumption(double consumption) {
        engine.setConsumption(consumption);
    }

    public double getConsumption() {
        return engine.getConsumption();
    }

    public void setFuelType(String fuelType) {
        engine.setFuelType(fuelType);
    }

    public String getFuelType() {
        return engine.getFuelType();
    }

    public void refill() {
        fuelAmount = maxFuel;
    }

    public void drive(int km) {
        // считаем количество нужного топлива
        double fuelNeeded = engine.getConsumption() / 100.0 * km;
        // если нужно больше топлива чем есть
        if (fuelNeeded > fuelAmount) {
            // выводим об этом сообщение и завершаем работу метода
            System.out.println("Недостаточно " + engine.getFuelType() + "!");
            return;
        }
        // отнимаем потраченное количество топлива от запаса топлива в баке
        fuelAmount -= fuelNeeded;
        // двигатель - работает
        engine.work();
        System.out.println("Машина проехала " + km + "км и скушала "
                + fuelNeeded + " литр " + engine.getFuelType());
    }

}
