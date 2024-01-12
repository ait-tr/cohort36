package classwork.task01_44;

import java.util.Scanner;

public class Main {
    public static final double MIN_FENCE_DIMENSION = 1.0;
    public static final int MIN_POLYGON_SIDES = 3;
    public static double inputNumber(double min, String message) {
        double val;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println(message);
            val = scanner.nextDouble();
        } while (val <= min);
        return val;
    }

    public static int inputNumber(int min, int max, String message) {
        int val;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println(message);
            val = scanner.nextInt();
        } while (val < min || val > max);
        return val;
    }

    public static void main(String[] args) {
        System.out.println("What is the shape of your yard?\n1. Rectangle\n2. Circle\n3. Polygon");
        int pick = inputNumber(1, 3, "Enter number from 1 to 3");
        Shape shape = null;
        switch (pick) {
            case 1:
                shape = new Rectangle(
                        inputNumber(MIN_FENCE_DIMENSION, "Enter length (greater than 1)"),
                        inputNumber(MIN_FENCE_DIMENSION, "Enter height (greater than 1)")
                );
                break;
            case 2:
                shape = new Circle(
                        inputNumber(MIN_FENCE_DIMENSION, "Enter radius (greater than 1)")
                );
                break;
            case 3:
                shape = new Polygon(
                        inputNumber(MIN_FENCE_DIMENSION, "Enter length (greater than 1)"),
                        inputNumber(MIN_POLYGON_SIDES, 180, "Enter amount of sides (between 3 and 180)")
                );
                break;
        }
        double price = inputNumber(0, "Enter price per meter: ");
        System.out.println("Total will be: " + shape.getPerimeter() * price + " euro");
    }
}
