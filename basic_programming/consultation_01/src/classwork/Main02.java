package classwork;

public class Main02 {
    public static void main(String[] args) {
        // заполнить массив значениями от 1 до 10, потом вывести этот массив 5 раз, каждый раз выводя на два элемента меньше

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < arr.length - i * 2; j++) {
                System.out.print(arr[j] + " ");
            }
            System.out.println();
        }
    }
}
