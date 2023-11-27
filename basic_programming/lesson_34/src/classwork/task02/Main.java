package classwork.task02;

import java.util.Scanner;

public class Main {

    /*
    Сделать программу, которая позволит просчитать сколько времени на путешествие
    уйдет если передвигаться на различном транспорте
    Транспорт: пешком, автобус, машина, поезд
    Время считать в минутах, путешествие в километрах
     */
    public static double minutes(TravelMethods method, double distance) {
        // считаем по формуле
        return (distance / (method.speedCoefficient * 5)) * 60;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many km to travel?");
        // получаем количество километров
        int km = scanner.nextInt();
        // values() вернет массив {TravelMethods.ON_FOOT, TravelMethods.BUS, TravelMethods.CAR, TravelMethods.TRAIN};
        TravelMethods[] methods = TravelMethods.values();
        System.out.println("Choose travel method");
        for (int i = 0; i < methods.length; i++) {
            // выводим все варианты
            System.out.println((i + 1) + ". " + methods[i]);
        }
        // получаем выбор пользователя
        int methodIndex = scanner.nextInt() - 1;
        // получаем метод по числу
        TravelMethods method = methods[methodIndex];
        // получаем время
        double time = minutes(method, km);
        System.out.println("Minutes to cover this distance: " + time);
    }
}
