package classwork.last_homework;

public class Main03_33 {

    public static int[] fibonacci(int n) {
        int[] res = new int[n];
        res[0] = 0;
        res[1] = 1;
        for (int i = 2; i < res.length; i++) {
            res[i] = res[i - 1] + res[i - 2];
        }
        return res;
    }

    public static void main(String[] args) {
        int amount = 10;
        int[] fib = fibonacci(amount);
        for (int i = 0; i < fib.length; i++) {
            System.out.print(fib[i] + " ");
        }
    }
}
