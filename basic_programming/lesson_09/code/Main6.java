package classwork;

import java.util.Scanner;

/**
 * 9/29/2023
 * lesson_09
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class Main6 {
    // Подсказки для HW07
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine(); // для простоты, вводите текст, содержащий только буквы англ алфавита

        // можно текст преобразовать в массив символов
        char[] characters = text.toCharArray();

        // можно даже пробежаться отдельно по каждому символу
        for (int i = 0; i < characters.length; i++) {
            // а еще можно взять числовой код (ASCII, Unicode) каждого символа
            int code = characters[i];
            // обратно:
            char charFromCode = (char)code;

            System.out.println(characters[i] + ", его код " + code);
        }

        // решить можно двумя не вложенными циклами и одним дополнительным массивом

        // вложенные цикли
        /*
            while () {
                while() {

                }
           }

           for () {
                for () {
                }
           }

        // не вложенные
            while() {
            }

            while() {
            }

            for () {
            }

            for () {
            }

         */


    }
}
