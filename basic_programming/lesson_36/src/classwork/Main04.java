package classwork;

import java.util.Scanner;

public class Main04 {

    /*
    Пользователь вводит какая на улице погода
    Предсказать, нужно ли брать солцезащитные очки, зонтик, одеться теплее, или ничего не нужно брать
     */

    public static String whatToTake(String weather) {
        switch (weather) {
            case "солнце":
            case "жара":
            case "жарко":
            case "солнечно":
                return "Взять солнцезащитные очки";
            case "дождь":
            case "пасмурно":
            case "ливень":
                return "Взять зонт";
            case "очень ветренно":
            case "холодно":
            case "идет снег":
            case "метель":
                return "Одеться теплее";
            default:
                return "Ничего не нужно брать";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(whatToTake(input));
    }
}
