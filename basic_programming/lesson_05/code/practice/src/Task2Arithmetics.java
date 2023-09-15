import java.util.Scanner;

public class Task2Arithmetics {

  // int vs. double в арифметике
  // print
  // println
  // if
  public static void main(String[] args) {
    // преобразование числа из одного типа в другой можно делать так:
    // (тип) число
    // число - литерал или переменная
    // например, `(long) 123` -- `123L`
//    int x = 123;
//    System.out.println((float) x);
//    double y = 24.76;
//    System.out.println((int) y); // дробная часть отбрасывается (НЕ округляется)
    // такое преобразование называется приведение (casting)

    // n школьников делят k яблок поровну, неделящийся остаток остается в корзинке.
    // Сколько яблок достанется каждому школьнику?
    // Сколько яблок останется в корзинке?
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите количество школьников:");
    int kids = scanner.nextInt();
    scanner.nextLine();
    System.out.println("Введите количество яблок:");
    int apples = scanner.nextInt();
    scanner.nextLine();
    System.out.println(kids + " школьников делят " + apples + " яблок поровну");

    int applesPerKid = apples / kids; // int / int = int
    double applesPerKidDouble = (double) apples / kids; // double / int = double
    // (double) (apples / kids) = (double) (38 / 5) = (double) 7 = 7.0
    // (double) apples / kids = 38.0 / 5 = 7.6
    // apples / (double) kids = 38 / 5.0 = 7.6
    // (double) apples / (double) kids = 38.0 / 5.0 = 7.6
    // при делении двух целых чисел получаем целый результат
    System.out.println("Каждому школьнику достанется по " + applesPerKid + " яблок");
    // int applesLeft = apples - applesPerKid * kids; // определение (apples % kids)
    // остатокОтДеления = делимое - частное * делитель
    System.out.println("После раздела останется " + (apples % kids) + " яблок");
    System.out.println("А могло бы достаться по " + applesPerKidDouble + " яблок");
    scanner.close();
  }
}
