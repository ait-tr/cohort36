package classwork;

public class Main02 {
    // напечатать числа от 0 до 100 которые делятся на 7 нацело
    public static void main(String[] args) {
        // У этого задания есть несколько вариантов решения
        // 1 вариант - самый простой. Выводим только подходящие числа
        for (int i = 0; i <= 100; i++) {
            if (i % 7 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();

        // 2 вариант - через continue. Пропускаем итерации, на которых число не подходит
        for (int i = 0; i <= 100; i++) {
            if (i % 7 != 0) {
                continue;
            }
            System.out.print(i + " ");
        }

        System.out.println();

        //3 вариант. Все итерации с номерами, делящимися на 7 нацело
        for (int i = 0; i <= 100; i = i + 7) {
            System.out.print(i + " ");
        }
    }
}

