package classwork.example01;

public class Triangle extends Shape implements Translatable {
    protected Point a;
    protected Point b;
    protected Point c;

    public Triangle(Point a, Point b, Point c) {
        super("Triangle");
        this.a = a.clone();
        this.b = b.clone();
        this.c = c.clone();
    }

    @Override
    public double getPerimeter() {
        double a = MathHelper.getDistance(this.b, this.c);
        double b = MathHelper.getDistance(this.a, this.c);
        double c = MathHelper.getDistance(this.a, this.b);

        return a + b + c;
    }

    @Override
    public double getSquare() {
        double a = MathHelper.getDistance(this.b, this.c);
        double b = MathHelper.getDistance(this.a, this.c);
        double c = MathHelper.getDistance(this.a, this.b);

        double p = getPerimeter() / 2;
        double res = p * (p - a) * (p - b) * (p - c);
        return Math.sqrt(res);
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

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }

    @Override
    public void translate(double x, double y) {
        a.translate(x, y);
        b.translate(x, y);
        c.translate(x, y);
    }
}
