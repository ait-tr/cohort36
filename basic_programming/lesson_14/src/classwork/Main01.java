package classwork;

import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) {
        // не получится использовать эту переменную, так как она объявлена ниже
        // System.out.println(number);
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number > 0) {
            int[] arr = new int[number];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = i * i;
                // (условие) ? (вариант если условие истинно) : (вариант если условие ложно)
                System.out.print(arr[i] + (i == arr.length - 1 ? "" : ", "));
            }
            // i не будет здесь доступно, так как она будет локальной переменной для предыдущего цикла
            // System.out.println(i);
        }
        // тоже самое и здесь: этот массив будет локальным для предыдущего условного оператора
        // arr[0] = 1;
    }
}
