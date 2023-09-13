import java.util.Scanner;

public class Main07IfElseIf {

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
    // если ровно 18, сказать "уже почти большой"
    // если больше, сказать "иди работай"
    // при вычислении условия в итоге получается ответ типа boolean - истина или ложь
    // при проверке нескольких вариантов "на выбор" по порядку приоритета,
    // можно объединить `else` и вложенный в него `if` в одну команду `else if`
//    if (условие) {
//      // действие, если условие истинно
//    } else if (второе условие) {
//      // действие, если второе условие истинно
//    } else if (третье условие) {
//      // действие, если третье условие истинно
//    } else {
//      // действие, если все условия ложны -- "во всех остальных случаях"
//    }
    if (age < 18) { // если возраст < 18
      System.out.println("Иди расти, ещё молодой...");
    } else if (age == 18) { // если не меньше, но равен 18
      System.out.println("Уже почти большой");
    } else { // иначе (возраст не меньше 18 и не равен - то есть больше)
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
