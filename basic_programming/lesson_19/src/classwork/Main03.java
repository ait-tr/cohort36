package classwork;

public class Main03 {
    //Исправить ошибку: все числа в результате получаются в 10 раз больше чем нужно

    public static int concat(int[] arr) {
        // переменная куда будем записывать результат
        int res = 0;
        // делаем два счетчика - i чтобы брать значения из массива и j чтобы получить соответствующее количество нулей
        // ошибка была: начальное значение j было на единицу больше чем нужно
        for (int i = 0, j = arr.length - 1; i < arr.length; i++, j--) {
            // используем формулу, которую записывали в примере
            res += (int) (arr[i] * Math.pow(10, j));
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {4, 8, 1, 2, 3};
        System.out.println(concat(arr));
        /*
        4 0 0 0 0
        4 8 0 0 0
        4 8 1 0 0
        4 8 1 2 0
        4 8 1 2 3
         */
    }
}
