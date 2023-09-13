import java.util.Scanner;

public class Main04If {

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
//    if (условие) {
//      // действие, если условие выполняется
//    }
    if (age < 18) {
      System.out.println("Иди расти, ещё молодой...");
    }

    System.out.println("А какое у тебя любимое блюдо?");
    String dish = scanner.nextLine();
    System.out.println("Классно, мне тоже нравится " + dish + "!");
    System.out.println("У нас так много общего...");

    System.out.println("До свидания!");
    scanner.close();
  }
}
