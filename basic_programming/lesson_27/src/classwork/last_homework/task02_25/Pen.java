package classwork.last_homework.task02_25;

public class Pen {
    // максимальное количество чернил в ручке
    public static final int MAX_INK = 1000;
    // текущее количество чернил в ручке
    public int inkAmount = MAX_INK;

    // метод написания текста
    public void write(String str) {
        // выполняем код только если в ручке хватает чернил
        // количество чернил больше или равно длинне строки
        if (inkAmount >= str.length()) {
            // выводим текст в консоль
            System.out.println(str);
            // отнимаем количество букв от чернил
            inkAmount -= str.length();
        }
    }

    public void refill() {
        // выставляем количество чернил назад на максимум
        inkAmount = MAX_INK;
    }

    public void checkInk() {
        // проверяем сколько чернил осталось
        System.out.println("Ink remaining: " + inkAmount);
    }
}
