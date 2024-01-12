package classwork.task01_44;

public class Polygon extends Shape {
    private double sideLength;
    private int sideAmount;

    public Polygon(double sideLength, int sideAmount) {
        this.sideLength = sideLength;
        this.sideAmount = sideAmount;
    }

    public double getSideLength() {
        return sideLength;
    }

    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }

    public int getSideAmount() {
        return sideAmount;
    }

    public void setSideAmount(int sideAmount) {
        this.sideAmount = sideAmount;
    }

    @Override
    public double getPerimeter() {
        return sideAmount * sideLength;
    }
}
