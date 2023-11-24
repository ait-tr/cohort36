package classwork;

import java.util.Scanner;

public class Main02 {
    /*
    Разработать метод, который посчитает в строке гласные буквы
     */

    public static int countVowels(String text) {
        char[] letters = text.toCharArray();
        // все возможные гласные буквы
        char[] vowels = {'a', 'e', 'u', 'i', 'o', 'A', 'E', 'U', 'I', 'O'};
        int count = 0;
        // проходим по всем буквам строки
        for (int i = 0; i < letters.length; i++) {
            // для каждой буквы строки, проходим по массиву гласных букв
            for (int j = 0; j < vowels.length; j++) {
                // если текущая буква совпала с буквой из массива гласных букв
                if (letters[i] == vowels[j]) {
                    // увеличиваем счетчик на 1
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        System.out.println("Vowels in text you inputted: " + countVowels(text));
    }
}
