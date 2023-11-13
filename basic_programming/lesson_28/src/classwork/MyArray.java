package classwork;

public class MyArray {
    private double[] array;

    // конструктор по умолчанию
    public MyArray() {
        //
        array = new double[0];
    }

    // конструктор с параметрами
    public MyArray(double[] array) {
        // инициализируем моссив-поле массивом такой же длинны как и массив-параметр
        this.array = new double[array.length];
        // копируем все элементы из переданного массива в поле
        copy(array, this.array);
    }

    /*
    Метод копирования элементов из одного массива в другой
    src - source - откуда копировать
    dst - destination - куда копировать
     */
    private void copy(double[] src, double[] dst) {
        // итерируемся по всем элементам
        for (int i = 0; i < src.length; i++) {
            // записываем в целевой массив элемент из исходного
            dst[i] = src[i];
        }
    }

    // метод для получения значения элемента по индексу
    public double get(int index) {
        return array[index];
    }

    // метод для изменения значения элемента по индексу
    public void set(int index, double value) {
        array[index] = value;
    }

    // метод который возвращает размер массива
    public int size() {
        return array.length;
    }

    // метод поиска индекса элемента по значению
    public int indexOf(double val) {
        // Алгоритм линейного поиска (в классическом виде)
        for (int i = 0; i < array.length; i++) {
            if (array[i] == val) {
                return i;
            }
        }
        return -1;
    }

    public void add(int index, double val) {
        // если индекс неправильный, ничего не делаем
        if (index < 0 || index > array.length) {
            return;
        }
        // создаем новый массив на 1 больше чем был до этого
        double[] newArray = new double[array.length + 1];
        // копируем все элементы в новый массив
        copy(array, newArray);
        // идем с конца до индекса
        for (int i = newArray.length - 1; i > index; i--) {
            // записываем значение предыдущего элемента в текущий
            newArray[i] = newArray[i - 1];
        }
        // записываем сам элемент, который добавляли, в нужное место
        newArray[index] = val;
        // наконец, заменяем старый массив на новый
        array = newArray;
    }

    public void remove(int index) {
        // если индекс неправильный, ничего не делаем
        if (index < 0 || index >= array.length) {
            return;
        }
        // новый массив, на 1 меньше, так как удаляем элемент
        double[] newArray = new double[array.length - 1];
        // проходим по всему массиву
        for (int i = 0; i < newArray.length; i++) {
            // пока идем по элементам меньше нужного индекса удаления, копируем как обычно
            if (i < index) {
                newArray[i] = array[i];
            } else {
                // после того как прошли индекс, начинаем копировать элементы со смещением на 1 чтобы специально потерять
                // один элемент
                newArray[i] = array[i + 1];
            }
        }
        // заменяем старый массив на новый
        array = newArray;
    }

    // переводит объект в строку чтобы можно было легко вывести в sout
    public String toString() {
        String res = "[ ";
        for (int i = 0; i < array.length; i++) {
            res += array[i];
            if (i != array.length - 1) {
                res += ", ";
            }
        }
        res += " ]";
        return res;
    }
}
