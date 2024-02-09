package classwork.last_homework;

import java.util.*;

public class Main02 {
        /*
    Подсчитать сколько раз слово встречается в списке строк
    Напечатать "Хеш-таблицу"
    Проверить, будут ли все строки в списке больше 10 символов в длинну
    Из строки сделать аббревиатуру
     */
        public static void main(String[] args) {
            List<LinkedList<Integer>> table = new ArrayList<>();
            for (int i = 0; i < 5; i++) {
                table.add(new LinkedList<>());
            }
            Random random = new Random();
            for (LinkedList<Integer> list : table) {
                int elem = random.nextInt() % 10;
                do {
                    list.add(elem);
                    elem = random.nextInt() % 10;
                } while (elem != 0);
            }

            table.stream()
                    .flatMap(Collection::stream)
                    .forEach(i -> System.out.print(i + " "));
            System.out.println();
            for (LinkedList<Integer> list : table) {
                System.out.println(list);
            }
        }
}
