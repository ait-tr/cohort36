package classwork;

import java.util.Scanner;

public class Main04 {
    // Пользователь вводит цифру, нужно написать что это за цифра словами

    public static String numberToString(int digit) {
        // проверяем значение с помощью оператора переключателя
        switch (digit) {
            // от 0 до 9 точно знаем какие названия цифр, поэтому для каждого значения возвращаем правильное название
            case 0:
                return "zero";
            case 1:
                return "one";
            case 2:
                return "two";
            case 3:
                return "three";
            case 4:
                return "four";
            case 5:
                return "five";
            case 6:
                return "six";
            case 7:
                return "seven";
            case 8:
                return "eight";
            case 9:
                return "nine";
            // во всех случаях кроме 0-9, пишем что не знаем такую цифру, потому что это число, а не цифра
            default:
                return "I dont know this digit";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int digit = scanner.nextInt();
        System.out.println(numberToString(digit));
    }
}


 /*
        // вот так мы бы сделали тоже самое что в методе numberToString через ифы
        if (digit == 0) {
            System.out.println("zero");
        } else if (digit == 1) {
            System.out.println("one");
        } else if (digit == 2) {
            System.out.println("two");
        } else if (digit == 3) {
            System.out.println("three");
        } else if (digit == 4) {
            System.out.println("four");
        } else if (digit == 5) {
            System.out.println("five");
        } else if (digit == 6) {
            System.out.println("six");
        } else if (digit == 7) {
            System.out.println("seven");
        } else if (digit == 8) {
            System.out.println("eight");
        } else if (digit == 9) {
            System.out.println("nine");
        } else {
            System.out.println("I dont know this number");
        }
        */