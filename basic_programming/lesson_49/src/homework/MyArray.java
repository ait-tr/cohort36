package homework;

import java.util.Iterator;

public class MyArray<E> implements Iterable<E> {
    private Object[] array;

    // конструктор по умолчанию
    public MyArray() {
        array = new Object[0];
    }

    // конструктор с параметрами
    public MyArray(E[] array) {
        // инициализируем массив-поле массивом такой же длинны как и массив-параметр
        this.array = new Object[array.length];
        // копируем все элементы из переданного массива в поле
        copy(array, this.array);
    }

    /*
    Метод копирования элементов из одного массива в другой
    src - source - откуда копировать
    dst - destination - куда копировать
     */
    private void copy(Object[] src, Object[] dst) {
        // итерируемся по всем элементам
        for (int i = 0; i < src.length; i++) {
            // записываем в целевой массив элемент из исходного
            dst[i] = src[i];
        }
    }

    // метод для получения значения элемента по индексу
    public E get(int index) {
        return (E) array[index];
    }

    // метод для изменения значения элемента по индексу
    public void set(int index, E value) {
        array[index] = value;
    }

    // метод который возвращает размер массива
    public int size() {
        return array.length;
    }

    // метод поиска индекса элемента по значению
    public int indexOf(E val) {
        // Алгоритм линейного поиска (в классическом виде)
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(val)) {
                return i;
            }
        }
        return -1;
    }

    public void add(int index, E val) {
        // если индекс неправильный, ничего не делаем
        if (index < 0 || index > array.length) {
            return;
        }
        // создаем новый массив на 1 больше чем был до этого
        Object[] newArray = new Object[array.length + 1];
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

    public void add(E val) {
        add(array.length, val);
    }

    public void remove(int index) {
        // если индекс неправильный, ничего не делаем
        if (index < 0 || index >= array.length) {
            return;
        }
        // новый массив, на 1 меньше, так как удаляем элемент
        Object[] newArray = new Object[array.length - 1];
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
    @Override
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

    @Override
    public Iterator<E> iterator() {
        return new MyIterator<>(array);
    }

    private static class MyIterator<E> implements Iterator<E> {
        private Object[] array;
        private int currentIndex;

        public MyIterator(Object[] array) {
            currentIndex = 0;
            this.array = array;
        }

        @Override
        public boolean hasNext() {
            return currentIndex < array.length;
        }

        @Override
        public E next() {
            currentIndex++;
            return (E) array[currentIndex - 1];
        }
    }
}