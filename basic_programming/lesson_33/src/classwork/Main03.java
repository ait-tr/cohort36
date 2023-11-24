package classwork;

public class Main03 {

    /*
     Посчитать медиану целочисленного массива
     Посчитать среднее арифметическое
     Вывести оба значения
     */
    public static int mean(int[] arr) {
        int[] copy = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            copy[i] = arr[i];
        }

        for (int i = 0; i < copy.length - 1; i++) {
            int index = i;
            for (int j = i; j < copy.length; j++) {
                if (copy[j] < copy[index]) {
                    index = j;
                }
            }
            if (index != i) {
                int temp = copy[index];
                copy[index] = copy[i];
                copy[i] = temp;
            }
        }
        // считаем середину массива
        int center = copy.length / 2;
        if (copy.length % 2 == 1) {
            // если нечетное количество элементов, просто возвращаем элемент по центру
            return copy[center];
        } else {
            // если четное, то не существует центрального элемента. Считаем среднее арифметическое двух элементов посередине
            return (copy[center] + copy[center - 1]) / 2;
        }
    }

    public static double avg(int[] arr) {
        double sum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / arr.length;
    }

    public static void main(String[] args) {
        int[] arr = {15, 20, 7, 42, 33, 89, 50, 10, 5, 77, 2, 61, 3, 23, 30, 18, 45, 88, 12, 1000000000};
        System.out.println(mean(arr));
        // AVeraGe - среднее арифметическое
        System.out.println(avg(arr));
    }
}
