package classwork.last_homework;

import java.util.Scanner;

public class Main03_14 {

    // спрашивает какое-то целочисленное значение у пользователя
    public static int askValue(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextInt();
    }

    // переводит сантиметры в метры
    public static double convertToMeters(int cm) {
        return cm / 100.0;
    }

    // считает индекс массы тела
    public static double getBmi(int weight, double height) {
        return weight / (height * height);
    }

    // выводит оценку индекса массы тела
    public static void interpretBmi(double bmi) {
        if (bmi < 15) {
            System.out.println("You have anorexia! See doctor immediately!");
        } else if (bmi < 20) {
            System.out.println("You are underweight");
        } else if (bmi < 25) {
            System.out.println("You are normal weight!");
        } else if (bmi < 30) {
            System.out.println("You are overweight");
        } else {
            System.out.println("You have obesity! See doctor immediately!");
        }
    }

    public static void main(String[] args) {
        int weight = askValue("Input your weight in kg");
        int height = askValue("Input your height in cm");

        double heightM = convertToMeters(height);
        double bmi = getBmi(weight, heightM);
        System.out.println("Your BMI is: " + bmi);
        interpretBmi(bmi);
    }
}
