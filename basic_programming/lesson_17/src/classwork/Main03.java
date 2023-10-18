package classwork;

public class Main03 {
    /*
    На вход подается целочисленный массив, в котором записаны только цифры.
    Объединить этот массив в одно число.
    Ввод: 4 8 1 2 3
    Результат: 48123

    3 * 1 + 2 * 10 + 1 * 100 + 8 * 1000 + 4 * 10000

     */

    public static int concat(int[] arr) {
        // переменная куда будем записывать результат
        int res = 0;
        // делаем два счетчика - i чтобы брать значения из массива и j чтобы получить соответствующее количество нулей
        for (int i = 0, j = arr.length - 1; i < arr.length; i++, j--) {
            // используем формулу, которую записывали в примере
            res += arr[i] * Math.pow(10, j);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {4, 8, 1, 2, 3};
        System.out.println(concat(arr));
    }
}
