package classwork;

import java.util.Scanner;

public class Main05 {
    /*
    Устранить ошибку в программе:
    Если число заканчивается на 14, должно быть "часов", а выводит "часа"
     */
    public static String inclineHoursWord(int hours) {
        // если 11-14, надо выводить "часов" в любом случае
        switch (hours % 100) {
            case 11:
            case 12:
            case 13:
                // ошибка была: этот case отсутствовал
            case 14:
                return "часов";
        }

        switch (hours % 10) {
            case 1:
                return "час";
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
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();
        System.out.println(hours + " " + inclineHoursWord(hours));
    }
}
