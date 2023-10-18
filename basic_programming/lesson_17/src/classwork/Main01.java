package classwork;

public class Main01 {
    // Написать метод, которым можно посчитать сумму двух, трех или четырех чисел

    // Перегруженный метод с двумя параметрами
    public static int sum(int number1, int number2) {
        return number1 + number2;
    }

    // Тот же перегруженный метод, но с тремя параметрами
    public static int sum(int number1, int number2, int number3) {
        return number1 + number2 + number3;
    }

    // Тот же перегруженный метод, но с четырьмя параметрами
    public static int sum(int number1, int number2, int number3, int number4) {
        return number1 + number2 + number3 + number4;
    }

    public static void main(String[] args) {
        System.out.println("Sum of numbers: ");
        // вызываем разные перегрузки одного метода, передавая разные списки аргументов
        System.out.println(sum(2, 6));
        System.out.println(sum(1, 6, 8));
        System.out.println(sum(7, 6, 11, 2));

    }
}
