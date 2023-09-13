import java.util.Scanner;

public class Main01StrPlusInt {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // sout
    System.out.println("Текстовый бот v.0.0.2");

    System.out.println("Как тебя зовут?");
    String name = scanner.nextLine();
    System.out.println("Привет, " + name + "!");

    System.out.println("Сколько тебе лет?");
    System.out.print("Введите целое число: ");
    int age = scanner.nextInt();
//                                                      1     2   3
//    System.out.println("В следующем году тебе будет " + age + 1 + " лет!");
//    System.out.println("В следующем году тебе будет " + 30 + 1 + " лет!");
//    System.out.println("В следующем году тебе будет 30" + 1 + " лет!");
//    System.out.println("В следующем году тебе будет 301" + " лет!");
//    System.out.println("В следующем году тебе будет 301 лет!");
//                                                    2      1    3
    System.out.println("В следующем году тебе будет " + (age + 1) + " лет!");
//    System.out.println("В следующем году тебе будет " + (30 + 1) + " лет!");
//    System.out.println("В следующем году тебе будет " + 31 + " лет!");
//    System.out.println("В следующем году тебе будет 31" + " лет!");
//    System.out.println("В следующем году тебе будет 31 лет!");

    System.out.println("До свидания!");
    // закрытие сканера не обязательно делать при чтении с клавиатуры,
    // но обязательно при чтении из файла
    scanner.close();
  }
}
