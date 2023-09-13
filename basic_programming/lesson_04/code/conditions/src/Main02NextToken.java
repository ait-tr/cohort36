import java.util.Scanner;

public class Main02NextToken {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Текстовый бот v.0.0.2");

    System.out.println("Как тебя зовут?");
    String name = scanner.nextLine();
    System.out.println("Привет, " + name + "!");

    System.out.println("Сколько тебе лет?");
    System.out.print("Введите целое число: ");
    int age = scanner.nextInt(); // мы уверены, что пользователь введёт число и нажмёт Enter
    scanner.nextLine(); // строку можно дочитать до конца -- мы ничего не потеряем
    System.out.println("В следующем году тебе будет " + (age + 1) + " лет!");
    // next() и nextЧтоНибудь(), кроме nextLine, дочитывает до конца ТОКЕН (слово)
    // nextLine() дочитывает до конца СТРОКУ
    // если вы не знаете, что будет после nextЧтоНибудь() (например, nextInt()), но уверены,
    // что в прочитанной строке больше нет ничего полезного, то после nextЧтоНибудь()
    // надо написать nextLine()

    System.out.println("А какое у тебя любимое блюдо?");
    String dish = scanner.nextLine();
    System.out.println("Классно, мне тоже нравится " + dish + "!");
    System.out.println("У нас так много общего...");

    System.out.println("До свидания!");
    scanner.close();
  }
}
