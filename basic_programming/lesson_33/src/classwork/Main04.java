package classwork;

public class Main04 {

    /*
    Дается массив цифр
    В нем, все цифры меньше 5 заменить на 0
    Все цифры больше или равно 5 заменить на 1
    Вывести результат
     */

    public static void pseudoBinary(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] < 5 ? 0 : 1;
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 1, 7, 3, 0, 4, 6, 9, 2, 1, 8, 3, 5, 7, 4, 0, 6, 9};
        pseudoBinary(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
