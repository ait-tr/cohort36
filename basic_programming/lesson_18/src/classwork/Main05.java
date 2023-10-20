package classwork;

import java.util.Scanner;

public class Main05 {
    // Просклонять слово час в зависимости от числа перед этим словом
    // 42011 % 100

    public static String inclineHoursWord(int hours) {
        // если 11-14, надо выводить "часов" в любом случае
        switch (hours % 100) {
            case 11:
            case 12:
            case 13:
            case 14:
                return "часов";
        }
        // intentional breakout

        switch (hours % 10) {
            case 1:
                return "час";
            // делаем брейкаут чтобы для трех значений сразу делать один вывод
            case 2:
            case 3:
            case 4:
                return "часа";
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 0:
            default:
                return "часов";
        }
        /*
        // более оптимально, но менее понятно будет сделать так:
        switch (hours % 10) {
            case 1:
                return "час";
            case 2:
            case 3:
            case 4:
                return "часа";
            default:
                return "часов";
        }
        // с версии Java16 можно делать так:
        switch (hours % 10) {
            case 1:
                return "час";
            case 2, 3, 4:
                return "часа";
            case 5, 6, 7, 8, 9, 0:
                return "часов";
        }
        // через if else if мы бы написали вот так:
        int remainder = hours % 10;
        if (remainder == 1) {
            return "час";
        } else if (remainder == 2 || remainder == 3 || remainder == 4) {
            return "часа";
        } else if (remainder == 5 || remainder == 6 || remainder == 7 || remainder == 8 || remainder == 9 || remainder == 0) {
            return "часов";
        }
         */
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();
        System.out.println(hours + " " + inclineHoursWord(hours));
    }
}
