package multithreading.task_01;

// Имеется целочисленный счётчик.
// Задание:
// При помощи одного потока увеличить миллион раз счётчик на единицу
// и вывести его значение в консоль.

public class Counter {

    private static int counter;

    public static void main(String[] args) {

        for (int i = 0; i < 1_000_000; i++) { // when i = 999_999 last turn of cycle, 1_000_000 < 1_000_000 = false
            counter++;
        }

        System.out.println("Value of counter: " + counter);
    }
}
