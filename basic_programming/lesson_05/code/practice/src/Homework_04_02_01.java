import java.util.Scanner;

public class Homework_04_02_01 {

  // Lesson 4, Task 2
  // Напишите программу, которая попросит пользователя ввести год и определит,
  // високосный ли этот год.
  //
  // Если год является високосным, то выведите YES, иначе выведите NO.
  //
  // В соответствии с григорианским календарем, год является високосным,
  // если его номер кратен 4,
  // но не кратен 100,
  // а также если он кратен 400.
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введите год: ");
    int year = scanner.nextInt();
    if (year % 4 == 0) {
      // делится на 100, значит, делится на 4
      if (year % 100 == 0) {
        // делится и на 100, и на 4
        if (year % 400 == 0) {
          // делится и на 4, и на 100, и на 400
          System.out.println("YES");
        } else {
          System.out.println("NO");
        }
      } else {
        // делится на 4, но не делятся на 100
        System.out.println("YES");
      }
    } else {
      System.out.println("NO");
    }
    scanner.close();
  }
}
