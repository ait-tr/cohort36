package classwork;

import java.util.Scanner;

public class Main02 {
    /*
    Пользователем введена строка из нескольких слов.
    Нужно вывести ту же строку, только каждое слово написать с новой строки
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String line = scanner.nextLine();
        // строка - это по сути массив символов
        // Этот массив символов из строки можно легко получить с помощью метода toCharArray()
        char[] arr = line.toCharArray();
        // В этом примере можно сделать и привычным способом, но мы сделаем вот так
        for (int i = 0; i < line.length(); i++) {
            // если символ - пробел, переносим на новую строку
            if (arr[i] == ' ') {
                System.out.println();
            } else {
                // если не пробел, просто печатаем символ
                System.out.print(arr[i]);
            }
        }
    }
}
