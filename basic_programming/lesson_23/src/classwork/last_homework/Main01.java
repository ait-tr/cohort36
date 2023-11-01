package classwork.last_homework;

import java.util.Scanner;

public class Main01 {

    public static String getDayOfWeekName(int number) {
        switch (number) {
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            case 7:
                return "Sunday";
        }
        return "";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dayOfWeekNumber = scanner.nextInt();
        if (dayOfWeekNumber < 1 || dayOfWeekNumber > 7) {
            System.out.println("Wrong number");
            return;
        }
        System.out.println(getDayOfWeekName(dayOfWeekNumber));
    }
}
