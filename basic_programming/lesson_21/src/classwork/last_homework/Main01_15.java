package classwork.last_homework;

import java.util.Random;
import java.util.Scanner;

public class Main01_15 {

    // должен возвращать случайное слово из определенного списка
    public static String getRandomWord() {
        // ГСЧ
        Random random = new Random();
        // список слов из которого будем выбирать
        String[] words = {"programming", "java", "method", "variable", "integer", "number", "string", "boolean"};
        // генерируем случайное число в границах массива. Это будет индекс случайного элемента
        int index = random.nextInt(words.length);
        // выбираем из массива случайных элемент
        return words[index];
    }

    // вывести в консоль по подчеркиванию для каждой буквы слова
    public static void printWord(char[] word, boolean[] guessedLetters) {
        System.out.println("Your word: ");
        for (int i = 0; i < word.length; i++) {
            // если в массиве угаданных букв указано true, то есть эта буква отгадана, то выводим букву. Если нет, то
            // выводим подчеркивание
            System.out.println((guessedLetters[i] ? word[i] : "_") + " ");
            /*
            if (guessedLetters[i]) {
                System.out.println(word[i] + " ");
            } else {
                System.out.println("_ ");
            }
             */
        }
    }

    /*
     Проверяет есть ли буква в слове
     Отмечает ее в массиве отметок об угаданных буквах как угаданную, и возвращает true
     Если буквы нет в слове, возвращает false
     */
    public static boolean checkLetters(char[] word, boolean[] guessedLetters, char letter) {
        // переменная отвечает на вопрос нашли ли мы букву. До того как начали искать считаем что не нашли
        boolean found = false;
        for (int i = 0; i < word.length; i++) {
            // если буква есть в слове
            if (letter == word[i]) {
                // обозначаем эту букву как угаданную
                guessedLetters[i] = true;
                // говорим что нашли букву
                found = true;
            }
        }
        return found;
    }

    // проверить, будут ли все буквы угаданы
    public static boolean allLettersGuessed(boolean[] guessedLetters) {
        for (int i = 0; i < guessedLetters.length; i++) {
            // если хотя бы одна буква не угадана, то ответ на вопрос НЕТ
            if (!guessedLetters[i]) {
                return false;
            }
        }
        // если нет неугаданных букв то ответ на вопрос ДА
        return true;
    }

    public static void main(String[] args) {
        // получаем случайное слово
        char[] word = getRandomWord().toCharArray();
        // создаем массив, где будем отмечать, какие буквы угаданы.
        // В этом массиве по умолчанию все значения false, поэтому ничего больше не делаем
        // потому что в начале программы все буквы - не угаданы
        boolean[] guessedLetters = new boolean[word.length];
        Scanner scanner = new Scanner(System.in);
        // количество попыток ввести неправильную букву
        int attempts = 7;
        // пока количество попыток больше нуля, выполняем программу
        while (attempts > 0) {
            // выводим буквы слова и подчеркивания где буквы не угаданы
            printWord(word, guessedLetters);
            System.out.println("Attempts left: " + attempts + "\n");
            // получаем ввод пользователя
            char letter = scanner.next().toCharArray()[0];
            // если буквы нет в слове
            if (!checkLetters(word, guessedLetters, letter)) {
                // отнимаем одну попытку
                attempts--;
            }
            // если все буквы угаданы
            if (allLettersGuessed(guessedLetters)) {
                // выводим поздравление
                System.out.println("Congratulations! You guessed the word: ");
                System.out.println(word);
                // заканчиваем программу
                return;
            }
        }
        // сюда попадаем только когда закончились попытки. Выводим, что пользователь проиграл
        System.out.println("Too bad, you lost! Word was: ");
        System.out.println(word);
    }
}
