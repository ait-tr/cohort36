package classwork;

public class Main01 {
    public static void main(String[] args) {
        // Просто выводим информацию про логические операторы
        System.out.println("Оператор отрицания (!)");
        // !
        System.out.println("NOT true = " + !true);
        System.out.println("NOT false = " + !false);

        System.out.println("Оператор И (&&)");
        // &&
        System.out.println("false AND false = " + (false && false));
        System.out.println("false AND true = " + (false && true));
        System.out.println("true AND false = " + (true && false));
        System.out.println("true AND true = " + (true && true));

        System.out.println("Оператор ИЛИ (||)");
        // ||
        System.out.println("false OR false = " + (false || false));
        System.out.println("false OR true = " + (false || true));
        System.out.println("true OR false = " + (true || false));
        System.out.println("true OR true = " + (true || true));
    }
}
