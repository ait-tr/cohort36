package classwork;

public class Main03 {
    /*
    Добавить в первый массив все элементы из второго массива, которых нет в первом
     */
    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // линейный поиск, но просто проверяет, существует ли элемент в массиве вместо нахождения индекса
    public static boolean contains(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return true;
            }
        }
        return false;
    }

    public static int[] resize(int[] arr, int newSize) {
        // делаем массив в новым размером
        int[] temp = new int[newSize];
        // выполняем цикл пока i одновременно меньше длинны обоих массивов
        for (int i = 0; i < arr.length && i < temp.length; i++) {
            // просто копируем элементы
            temp[i] = arr[i];
        }
        return temp;
    }

    /*
    Дополнительное задание: реализовать тот же алгоритм с меньшим количеством кода, либо проще
     */
    // обратите внимание: этот метод можно и нужно написать проще
    public static int[] concat(int[] arr1, int[] arr2) {
        // длинна массива - максимум как два вводных массива
        int[] temp = new int[arr1.length + arr2.length];
        // счетчик уникальных элементов во втором массиве по сравнению с первым
        int uniqueElements = 0;
        // три счетчика: один для большого массива, один для первого, один для второго
        for (int i = 0, i1 = 0, i2 = 0; i < temp.length; i++) {
            // пока записываем первый массив, просто записываем элемент и начинаем следующую итерацию
            if (i < arr1.length) {
                temp[i] = arr1[i1];
                i1++;
                continue;
            }
            // если первый массив не содержит текущего элемента во втором массиве
            if (!contains(arr1, arr2[i2])) {
                // добавляем этот элемент в большой массив. Делаем отступ от начала большого массива на arr1.length
                temp[arr1.length + uniqueElements] = arr2[i2];
                // увеличиваем счетчик уникальных элементов чтобы в следующий раз не перезаписать уже добавленный элемент
                uniqueElements++;
            }
            i2++;
        }
        // убираем лишние элементы из массива
        return resize(temp, arr1.length + uniqueElements);
    }

    public static void main(String[] args) {
        int[] arr1 = {4, 6, 8, 9};
        int[] arr2 = {1, 2, 3, 4, 5, 6};
        int[] res = concat(arr1, arr2);
        printArr(res);
    }
}
