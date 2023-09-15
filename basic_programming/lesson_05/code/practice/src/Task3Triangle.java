import java.util.Scanner;

public class Task3Triangle {

  public static void main(String[] args) {
    // неравенство треугольника
    // длина каждой сторона должна быть меньше суммы длин двух оставшихся
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int c = scanner.nextInt();
    if (a >= b + c) { // если всё плохо - если a больше, чем две оставшиеся
      System.out.println("NO");
    } else if (b >= a + c) { // если всё плохо - если b больше, чем две оставшиеся
      System.out.println("NO");
    } else if (c >= a + b) { // если всё плохо - если с больше, чем две оставшиеся
      System.out.println("NO");
    } else { // остальные варианты -- все плохие уже проверили
      System.out.println("YES");
    }
    scanner.close();
  }
}
