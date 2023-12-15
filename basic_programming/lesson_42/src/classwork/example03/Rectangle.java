package classwork.example03;

public class Rectangle extends Shape {
    protected double length;
    protected double height;

    public Rectangle(double length, double height) {
        super("Rectangle");
        this.length = length;
        this.height = height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (length + height);
    }

    @Override
    public double getSquare() {
        return length * height;
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

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", height=" + height +
                '}';
    }
}
