import java.util.Scanner;

public class Task6Watches {

  // вводят общее количество минут с начала суток
  // вывести часы и минуты
  // Пример ввода:
  // 585
  // Пример вывода:
  // 9 45
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введите количество минут с начала суток: ");
    int totalMinutes = scanner.nextInt();
    int hours = totalMinutes / 60;
    // минуты - остаток от деления всех минут на 60
    int minutes = totalMinutes % 60;
//    int minutes = totalMinutes - hours * 60; // определение остатка от деления totalMinutes / 60
    System.out.println("Прошло " + hours + " часов " + minutes + " минут с начала суток");
    scanner.close();
  }
}
