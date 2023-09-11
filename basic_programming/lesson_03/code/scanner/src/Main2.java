import java.util.Scanner;

public class Main2 {

  public static void main(String[] args) {
    // System.out - поток вывода, вывод на экран (output)
    // System.in - поток ввода, ввод с клавиатуры (input)
    Scanner scanner = new Scanner(System.in);
    // создали переменную scanner типа (класса) Scanner, которая будет читать из System.in
    System.out.println("Текстовый бот v.0.0.1");
    System.out.println("Как тебя зовут?");
    String name = scanner.nextLine(); // прочитать и сохранить введённую строку
    System.out.println("Привет, " + name + "!");
    System.out.println("А сколько тебе лет?");
    int age = scanner.nextInt(); // прочитать и сохранить введённое целое число
    System.out.println("Классно! А через год тебе будет " + (age + 1) + "!");
  }
}
