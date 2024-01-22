package classwork.example02;

public class ArithmeticHelper {
    public static double add(double a, double b) {
        return a + b;
    }

    public static double diff(double a, double b) {
        return a - b;
    }

    public static double mult(double a, double b) {
        if (a == 0.0 || b == 0.0) {
            //return 0.0;
        }
        return a * b;
    }

    public static double div(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Division by 0");
        }
        return a / b;
    }
}
