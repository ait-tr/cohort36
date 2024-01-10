package classwork.task04;

public class Main {
    /*
    Сделать ранее разработанный класс MyArray обобщенным
     */
    public static void main(String[] args) {
        // MyArray object of generic type String
        // Объект класса MyArray обобщенного типа String
        MyArray<String> strings = new MyArray<>();
        // добавляем элементы
        strings.add("Hello");
        strings.add("Hey");
        strings.add("Greetings");
        strings.add("Hi");
        // выводим в консоль
        System.out.println(strings);

        // делаем тоже самое, только с другим типом
        MyArray<Double> numbers = new MyArray<>();
        numbers.add(456.0);
        numbers.add(123.6);
        numbers.add(879.45316);
        numbers.add(0, 0.0);
        System.out.println(numbers);

    }
}
