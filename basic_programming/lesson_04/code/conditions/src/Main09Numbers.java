import java.util.Scanner;

public class Main09Numbers {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введите целое число: ");
    int x = scanner.nextInt();
    System.out.println("Вы ввели число " + x);
    // x кратно k - число кратно делителю
    // x делится на k без остатка
    // остаток от деления x на k равен 0
    if (x % 3 == 0) { // если x кратно 3 - если остаток от деления x на 3 равен нулю
      System.out.println("Ваше число кратно 3");
    } else { // x % 3 != 0 - если x не кратно 3 - если остаток от деления x на 3 не равен нулю
      System.out.println("Ваше число не кратно 3");
    }
    scanner.close();
  }
}
