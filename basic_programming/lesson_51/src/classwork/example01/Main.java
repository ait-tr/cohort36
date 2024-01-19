package classwork.example01;

import java.util.Arrays;

public class Main {

    /*
    Разработать метод, который принимает строку, в которой написан массив.
    Посчитать сумму этого массива
     */

    public static int calculateSum(String arr) {
        // разделить строку по пробелу на массив строк
        String[] numbers = arr.split(" ");
        int sum = 0;
        for (String s : numbers) {
            // считаем сумму
            sum += Integer.parseInt(s);
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(calculateSum("1 2 3 4"));
        System.out.println(calculateSum("4 68 122 35 81 32"));
    }
}
