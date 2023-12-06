package classwork.example02.animals;

public class Canine extends Animal {
    protected String furColor;
    protected String furType;
    protected double length; // длинна от носа до кончика хвоста
    protected double height;

    public Canine(String species, String habitationArea, double averageLifespan, String furColor,
                  String furType, double length, double height) {
        super(species, habitationArea, averageLifespan);
        this.furColor = furColor;
        this.furType = furType;
        this.length = length;
        this.height = height;
    }

    public void bark() {
        System.out.println("гав гав гав");
    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    public String getFurType() {
        return furType;
    }

    public void setFurType(String furType) {
        this.furType = furType;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
