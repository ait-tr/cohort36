package classwork.last_homework;
//На вход подается последовательность целых положительных чисел
//Последовательность оканчивается числом -1
//Нужно вывести сумму всех чисел, у которых сумма цифр есть четное число
import java.util.Scanner;

public class Main01 {

    public static void main(String[] args) {
        // Создаем сканнер, чтобы считывать ввод пользователя
        Scanner scanner = new Scanner(System.in);

        // 5 = 5 + 0
        // переменная, в которую мы будем записывать результат
        int sumOfNumbers = 0;
        // переменная, которая хранит текущее значение, введенное пользователем
        int currentNumber = scanner.nextInt();

        // Выполняем цикл пока текущее число не равно -1
        while (currentNumber != -1) {
            // переменная для суммы цифр
            int digitsSum = 0;

            // temp = temporary = временный
            // вторая переменная для хранения текущего значения. Нужна чтобы не потерять значени
            // когда мы считаем сумму цифр
            int tempNumber = currentNumber;

            // выполняем цикл пока текущее число не станет 0
            while (currentNumber != 0) {
                // достаем из числа последнюю цифру
                int lastDigit = currentNumber % 10;
                // прибавляем цифру к переменной, в которой хранится сумма цифр
                digitsSum = digitsSum + lastDigit;
                // получаем целую часть деления на 10 и записываем обратно в число
                currentNumber = currentNumber / 10;
            }
            // проверяем число на парность и выполняем код если оно парное
            if (digitsSum % 2 == 0) {
                // добавляем наше число к общей сумме
                sumOfNumbers = sumOfNumbers + tempNumber;
            }
            // считываем новое число от пользователя
            currentNumber = scanner.nextInt();
        }
        // вывод результата
        System.out.println(sumOfNumbers);
    }
}

// Если считать произведение, происходит переполнение данных, так как мы выходим за границы допустимых значений в int
// 2 миллиарда 100 миллионов с чем-то - верхняя граница типа int