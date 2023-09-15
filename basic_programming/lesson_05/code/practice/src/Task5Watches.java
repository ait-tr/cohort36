import java.util.Scanner;

public class Task5Watches {

  // вводят часы и минуты
  // вывести общее количество минут с начала суток
  // Пример ввода:
  // 9 45
  // Пример вывода:
  // 585
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введите часы и минуты через пробел: ");
    int hours = scanner.nextInt();
    if (hours > 23) { // условие-стражник (guardian condition)
      System.out.println("Количество часов должно быть меньше 24");
      return; // досрочное завершение метода main
    }
    if (hours < 0) { // условие-стражник (guardian condition)
      System.out.println("Количество часов должно быть положительным");
      return; // досрочное завершение метода main
    }
    int minutes = scanner.nextInt();
    if (minutes > 59) { // условие-стражник (guardian condition)
      System.out.println("Количество минут должно быть меньше 60");
      return; // досрочное завершение метода main
    }
    if (minutes < 0) { // условие-стражник (guardian condition)
      System.out.println("Количество минут должно быть положительным");
      return; // досрочное завершение метода main
    }
    int totalMinutes = hours * 60 + minutes;
    System.out.println("Прошло " + totalMinutes + " минут с начала суток");
    scanner.close();
  }
}
