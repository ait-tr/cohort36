package classwork;

import java.util.Random;
import java.util.Scanner;

public class Main07 {

    /*
    Считать у пользователя размер массива, создать этот массив
    Заполнить массив случайными значениями от 0 до 10
    Вывести этот массив на экран
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[scanner.nextInt()];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(11);
            System.out.print(arr[i] + " ");
        }
    }
}
