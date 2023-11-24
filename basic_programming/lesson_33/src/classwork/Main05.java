package classwork;

public class Main05 {

    public static int factorial(int n) {
        // условие остановки рекурсии
        if (n <= 1) {
            return 1;
        }
        // выполняем рекурсивный вызов этого же метода с изменением значения
        return factorial(n - 1) * n;
    }

    public static void main(String[] args) {
        System.out.println(factorial(7));
    }
}
