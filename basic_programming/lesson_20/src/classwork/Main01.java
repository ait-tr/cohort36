package classwork;

public class Main01 {
    /*
    Написать метод, который добавит один элемент с заданным значением в конец массива
     */

    public static int[] add(int[] arr, int value) {
        // временный массив для того чтобы добавить новый элемент
        int[] temp = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            // каждый элемент по одному записываем из старого в новый массив
            temp[i] = arr[i];
        }
        // индекс позиции после последнего элемента всегда равен размеру массива
        temp[arr.length] = value;
        // возвращаем массив
        return temp;
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};
        printArr(arr);
        System.out.println();
        arr = add(arr, 11);
        printArr(arr);
    }

}
