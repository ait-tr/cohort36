package classwork;

public class Main05 {
    public static void main(String[] args) {
        // какой-то массив со значениями из головы который нужно сортировать
        int[] arr = {5, 17, 1, 0, 8, 10};

        // обрабатываем весь массив кроме последнего элемента
        for (int i = 0; i < arr.length - 1; i++) {
            // Нужно найти самый маленький элемент от i до arr.length
            // пишем алгоритм поиска экстремума (экстремального значения)
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                // если нашли элемент, который меньше того, который мы считали самым маленьким, то...
                if (arr[index] > arr[j]) {
                    // ...записываем индекс этого элемента и считаем его самым маленьким
                    index = j;
                }
            }
            // если индекс остался таким же как и до поиска, это значит, что элемент уже на своем месте
            if (index == i) {
                // начинаем следующую итерацию
                continue;
            }
            // сюда мы попадем только если элементы нужно поменять местами
            // меняем местами значения элементов массива
            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }

        // выводим массив в консоль
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}