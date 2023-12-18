package classwork.example01;

public class Circle extends Shape {
    protected double radius;
    protected Point centerPosition;

    public Circle(double radius, double x, double y) {
        super("Circle");
        this.radius = radius;
        centerPosition = new Point(x, y);
    }

    public Circle(double radius, Point pos) {
        this(radius, pos.getX(), pos.getY());
    }

    @Override
    public double getPerimeter() {
        return Math.PI * 2 * radius;
    }

    @Override
    public double getSquare() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    public Point getCenterPosition() {
        return centerPosition;
    }

    public void setCenterPosition(Point centerPosition) {
        this.centerPosition = centerPosition;
    }
}
