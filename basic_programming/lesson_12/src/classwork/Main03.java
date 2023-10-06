package classwork;

import java.util.Random;

public class Main03 {
    // Сгенерировать случайное число
    public static void main(String[] args) {
        System.out.println("Ваше случайное число: ");
        // Создаем генератор случайных чисел
        Random random = new Random();
        // Генерация нового случайного числа
        int number = random.nextInt();
        // вывод числа
        System.out.println(number);
    }
}
