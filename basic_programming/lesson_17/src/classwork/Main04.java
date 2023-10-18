package classwork;

public class Main04 {
    // написать метод, который считает целую степень числа

    public static double power(double base, int pow) {
        // если степень ноль, результат всегда 1
        if (pow == 0) {
            return 1;
        }
        // если степнь меньше ноля,
        if (pow < 0) {
            // "переворачиваем" число (делим 1 на это число)
            base = 1 / base;
            // делаем степень позитивной
            pow *= -1;
        }

        double res = 1;
        // умножаем число само на себя столько раз, сколько число степени
        for (int i = 0; i < pow; i++) {
            res *= base;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(power(2, -3));
    }
}
