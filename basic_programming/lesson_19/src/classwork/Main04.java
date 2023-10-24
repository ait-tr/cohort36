package classwork;

public class Main04 {
    // Исправить ошибку: метод степени работает как умножение
    public static double power(double base, int pow) {
        if (pow == 0) {
            return 1;
        }
        if (pow < 0) {
            base = 1 / base;
            pow *= -1;
        }

        // ошибка была: начальное значение 0
        double res = 1;
        for (int i = 0; i < pow; i++) {
            // ошибка была: + вместо *
            res *= base;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(power(2, 6));
    }
}
