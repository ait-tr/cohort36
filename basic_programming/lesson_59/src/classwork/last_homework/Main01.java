package classwork.last_homework;

import java.util.List;

public class Main01 {
    /*
    Подсчитать сколько раз слово встречается в списке строк
    Напечатать "Хеш-таблицу"
    Проверить, будут ли все строки в списке больше 10 символов в длинну
    Из строки сделать аббревиатуру
     */
    public static void main(String[] args) {
        List<String> list = List.of("123", "233", "233", "456", "457", "8448", "5413", "233");

        int occurencies = (int) list.stream()
                .filter(s -> s.equals("233"))
                .count();
        System.out.println(occurencies);
    }
}
