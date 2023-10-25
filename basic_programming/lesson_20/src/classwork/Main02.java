package classwork;

public class Main02 {
    /*
    Объединить два массива в один, приставив все элементы второго массива к первому
     */
    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int[] concat(int[] arr1, int[] arr2) {
        // итоговый размер будет как сумма двух изначальных массивов
        int[] temp = new int[arr1.length + arr2.length];
        // по счетчику для каждого массива здесь
        for (int i = 0, i1 = 0, i2 = 0; i < temp.length; i++) {
            // пока не дописали первый, записываем первый
            if (i < arr1.length) {
                temp[i] = arr1[i1];
                i1++;
            } else { // в ином случе, записываем второй
                temp[i] = arr2[i2];
                i2++;
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        int[] arr1 = {4, 6, 8, 9};
        int[] arr2 = {1, 2, 3, 4, 5, 6};
        int[] res = concat(arr1, arr2);
        printArr(res);
    }
}
