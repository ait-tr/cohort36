import java.util.Scanner;

public class Main05IfElse {

  // примитивные типы данных:
  // числа - byte, short, int, long, float, double
  // символы - char - 2 байта - хранит код символа
  // логические значения - boolean - теоретически 1 бит - хранит false (ложь, 0) и true (истина, 1)
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Текстовый бот v.0.0.2");

    System.out.println("Как тебя зовут?");
    String name = scanner.nextLine();
    System.out.println("Привет, " + name + "!");

    System.out.println("Сколько тебе лет?");
    System.out.print("Введите целое число: ");
    int age = scanner.nextInt();
    scanner.nextLine();
    // если возраст меньше 18, сказать "иди расти, ещё молодой"
    // а если 18 или больше, сказать "иди работай"
    // при вычислении условия в итоге получается ответ типа boolean - истина или ложь
//    if (условие) {
//      // действие, если условие истинно
//    } else {
//      // действие, если условие ложно
//    }
    if (age < 18) { // если возраст < 18
      System.out.println("Иди расти, ещё молодой...");
    } else { // иначе (возраст не меньше 18 - то есть больше или равно)
      System.out.println("Иди работай!");
    }

    System.out.println("А какое у тебя любимое блюдо?");
    String dish = scanner.nextLine();
    System.out.println("Классно, мне тоже нравится " + dish + "!");
    System.out.println("У нас так много общего...");

    System.out.println("До свидания!");
    scanner.close();
  }
}
