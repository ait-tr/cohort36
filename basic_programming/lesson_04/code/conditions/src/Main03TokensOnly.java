import java.util.Scanner;

public class Main03TokensOnly {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Текстовый бот v.0.0.2");

    // Читаем ввод только токенами
    // Разделитель для токенов - пустое пространство (пробелы, табуляция, перевод строки)
    System.out.println("Как тебя зовут?");
    String name = scanner.next(); // если ввести больше одного слова, то второе попадёт в строку 21
    System.out.println("Привет, " + name + "!");

    System.out.println("Сколько тебе лет?");
    System.out.print("Введите целое число: ");
    int age = scanner.nextInt();
    System.out.println("В следующем году тебе будет " + (age + 1) + " лет!");

    System.out.println("А какое у тебя любимое блюдо?");
    String dish = scanner.next();
    System.out.println("Классно, мне тоже нравится " + dish + "!");
    System.out.println("У нас так много общего...");

    System.out.println("До свидания!");
    scanner.close();
  }
}
