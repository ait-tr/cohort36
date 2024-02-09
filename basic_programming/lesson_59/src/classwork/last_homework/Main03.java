package classwork.last_homework;

import java.util.List;

public class Main03 {
    /*
    Проверить, будут ли все строки в списке больше 10 символов в длинну
    Из строки сделать аббревиатуру
     */

    public static void main(String[] args) {
        List<String> list = List.of("ajioehrgqwergqerg", ":quiwerhgqiuebrigub", "jayhugboiusaenrher", "1235467890");

        boolean allLonger = list.stream()
                                .mapToInt(String::length)
                                .min().getAsInt() >= 10;

        System.out.println(allLonger);
    }
}
