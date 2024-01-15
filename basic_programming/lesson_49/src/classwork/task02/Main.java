package classwork.task02;

import java.util.Scanner;

public class Main {
    // разработать метод который спрашивает натуральное число, и выкидывает исключение если введено неверное число

    public static int readNaturalNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter natural number");
        int number = scanner.nextInt();
        if (number <= 0) {
            // когда неправильный ввод, выкидываем исключение
            throw new RuntimeException("This is not natural number!");
        }
        return number;
    }

    public static void main(String[] args) {
        int number;
        try {
            // "пытаемся" выполнить код
            number = readNaturalNumber();
        } catch (RuntimeException ex) { // если что, ловим исключение
            // тут обрабатываем исключение
            System.out.println(ex.getMessage());
            return;
        }


        System.out.println("Thank you!");
    }
}
