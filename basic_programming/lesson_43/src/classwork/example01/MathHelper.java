package classwork.example01;

public class MathHelper {
    public static double getDistance(Point p1, Point p2) {
        double x = Math.abs(p1.getX() - p2.getX());
        double y = Math.abs(p1.getY() - p2.getY());

        return Math.sqrt(x * x + y * y);
    }
}
