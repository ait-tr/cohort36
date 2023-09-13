import java.util.Scanner;

public class Main10NumbersTernary {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введите целое число: ");
    int x = scanner.nextInt();
    System.out.println("Вы ввели число " + x);
//    String divisible;
//    if (x % 3 == 0) {
//      divisible = "кратно";
//    } else {
//      divisible = "не кратно";
//    }
    // условие ? значениеЕслиИстина : значениеЕслиЛожь
    String divisible = x % 3 == 0 ? "кратно" : "не кратно";
    System.out.println("Ваше число " + divisible + " 3");
    scanner.close();
  }
}
