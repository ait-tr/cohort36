package classwork.example01;

import java.security.interfaces.DSAKey;

public class Main {
    /*
    Разработать класс представляющий время в часах и минутах
    Разработать классы час и минута для этого
     */

    public static void printTime(DayTime time) {
        int hours = time.getHour();
        int minutes = time.getMinute();
        if (hours < 10) {
            System.out.print(0);
        }
        System.out.print(hours + ":");
        if (minutes < 10) {
            System.out.print(0);
        }
        System.out.print(minutes);
    }

    public static void main(String[] args) {
        DayTime time = new DayTime(9, 0);
        printTime(time);
    }
}
