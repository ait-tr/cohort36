import java.util.Scanner;

public class Homework_04_02_02 {

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
    if (year % 400 == 0) { // делится на 400
      System.out.println("YES");
    } else if (year % 100 == 0) { // не делится на 400, делится на 100
      System.out.println("NO");
    } else if (year % 4 == 0) { // не делится на 100, делится на 4
      System.out.println("YES");
    } else { // все остальные случаи
      System.out.println("NO");
    }
    scanner.close();
  }
}
