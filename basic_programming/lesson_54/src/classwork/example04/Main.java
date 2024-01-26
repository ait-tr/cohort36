package classwork.example04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    /*
    Разработать следующую программу:
    Пользователь вводит математическое действие, которое хочет выполнить.
    Действия: + - / * a
    Потом вводится неопределенное количество чисел. Если введен 0, это считается концом последовательности.
    При математических действиях нужно взять первое число как начальное значение, и выполнить выбранное действие
    над ним со всеми остальными числами.
    a - среднее арифметическое
    Вывести результат в консоль.
     */

    public static double calculate(char operation, List<Double> numbers) {
        if (!List.of('+', '-', '/', '*', 'a').contains(operation)) {
            throw new IllegalArgumentException("Operation " + operation + " not supported by this method!");
        }
        double res = operation == 'a'
                ? numbers.get(0) / numbers.size()
                : numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            double n = numbers.get(i);
            switch (operation) {
                case '+':
                    res += n;
                    break;
                case '-':
                    res -= n;
                    break;
                case '*':
                    res *= n;
                    break;
                case '/':
                    res /= n;
                    break;
                case 'a':
                    res += n / numbers.size();
                    break;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char operation = scanner.next().charAt(0);
        List<Double> numbers = new ArrayList<>();
        while (true) {
            double number = scanner.nextDouble();
            if (number == 0) {
                break;
            }
            numbers.add(number);
        }
        double res;
        try {
            res = calculate(operation, numbers);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return;
        }
        System.out.println("Result: " + res);
    }
}
