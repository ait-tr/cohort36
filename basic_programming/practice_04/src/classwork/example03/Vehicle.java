package classwork.example03;

public abstract class Vehicle {
    protected int maxPeopleAmount;
    protected int speed;
    protected String dateOfManufacture;

    public Vehicle(int maxPeopleAmount, int speed, String dateOfManufacture) {
        this.maxPeopleAmount = maxPeopleAmount;
        this.speed = speed;
        this.dateOfManufacture = dateOfManufacture;
    }

    public abstract void ride();

    public int getMaxPeopleAmount() {
        return maxPeopleAmount;
    }

    public void setMaxPeopleAmount(int maxPeopleAmount) {
        this.maxPeopleAmount = maxPeopleAmount;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getDateOfManufacture() {
        return dateOfManufacture;
    }

    public void setDateOfManufacture(String dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
    }
}
