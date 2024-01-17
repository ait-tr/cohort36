package classwork;

import java.util.Scanner;

public class Main04 {
    /*
    При считывании текста с картинки, программа другого программиста допустила ошибку
    Все буквы S она считала как 5, буквы O как 0 и буквы I как 1
    Написать метод который исправит эту ошибку
     */

    public static String correct(String text) {
        return text.replace('5', 'S').replace('0', 'O').replace('1', 'I');
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        System.out.println(correct(text));
    }
}
