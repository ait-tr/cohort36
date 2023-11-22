package classwork;

public class Main06 {
    /*
    Посчитать сумму всех четных чисел от 0 до 1000
     */
    /*
    a = 0 + a
     */
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i <= 1000; i += 2) {
            sum += i;
        }
        System.out.println(sum);
    }
}
