package classwork.example03;

public class Bicycle extends Vehicle {
    private int gears;
    private String classification;

    public Bicycle(int speed, String dateOfManufacture, int gears, String classification) {
        super(1, speed, dateOfManufacture);
        this.gears = gears;
        this.classification = classification;
    }

    @Override
    public void ride() {
        System.out.println("You are riding a bicycle at " + speed + " km/h");
    }

    public int getGears() {
        return gears;
    }

    public void setGears(int gears) {
        this.gears = gears;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }


}
