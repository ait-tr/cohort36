import java.util.Scanner;

public class Main08Ternary {

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
    // тернарный оператор позволяет "выбрать" одно из нескольких _значений_
    // условие ? значениеЕслиИстина : значениеЕслиЛожь
    String ageResponse = age < 18 ? "Иди расти, ещё молодой" : "Иди работай";
//    String ageResponse =
//        age < 18 ? "Иди расти, ещё молодой" : age == 18 ? "Почти большой" : "Иди работай";
    System.out.println(ageResponse);

    System.out.println("А какое у тебя любимое блюдо?");
    String dish = scanner.nextLine();
    System.out.println("Классно, мне тоже нравится " + dish + "!");
    System.out.println("У нас так много общего...");

    System.out.println("До свидания!");
    scanner.close();
  }
}
