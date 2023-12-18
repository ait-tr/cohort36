package classwork.example01;

public class Rectangle extends Shape implements Translatable {
    protected Point a;
    protected Point b;
    protected Point c;
    protected Point d;

    public Rectangle(Point p1, Point p2) {
        super("Rectangle");
        this.b = p1.clone();
        this.d = p2.clone();
        this.a = new Point(b.getX(), d.getY());
        this.c = new Point(d.getX(), b.getY());
    }

    @Override
    public double getPerimeter() {
        double length = MathHelper.getDistance(a, d);
        double height = MathHelper.getDistance(a, b);
        return 2 * (length + height);
    }

    @Override
    public double getSquare() {
        double length = MathHelper.getDistance(a, d);
        double height = MathHelper.getDistance(a, b);
        return length * height;
    }

    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public Point getB() {
        return b;
    }

    public void setB(Point b) {
        this.b = b;
    }

    public Point getC() {
        return c;
    }

    public void setC(Point c) {
        this.c = c;
    }

    public Point getD() {
        return d;
    }

    public void setD(Point d) {
        this.d = d;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", d=" + d +
                '}';
    }

    @Override
    public void translate(double x, double y) {
        a.translate(x, y);
        b.translate(x, y);
        c.translate(x, y);
        d.translate(x, y);
    }
}
