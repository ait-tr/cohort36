package classwork.task02;

import java.util.Iterator;

public class MyLinkedList<E> implements Iterable<E> {
    private Node<E> first;
    private int size;

    public MyLinkedList() {
        first = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void add(E value) {
        if (isEmpty()) {
            size = 1;
            first = new Node<>(value);
            return;
        }
        // ссылка на первый элемент, с нее будем проходиться до последнего элемента
        Node<E> node = first;
        // после выполнения этого цикла, в ссылке node будет записан последний элемент
        while (node.hasNext()) {
            // перезаписываем ссылку на следующий элемент
            node = node.getNext();
        }
        // создаем узел для нового значения
        Node<E> newNode = new Node<>(value);
        // привязываем новый узел к тому, который до этого был последним. Таким образом, добавляем новый элемент в конец
        node.setNext(newNode);
        // увеличиваем размер на 1
        size++;
    }

    public void add(E value, int index) {
        if (index >= size) {
            return;
        }
        if (isEmpty()) {
            size = 1;
            first = new Node<>(value);
            return;
        }
        // ссылка на первый элемент, с нее будем проходиться до последнего элемента
        Node<E> node = first;
        // делаем столько шагов, какое значение индекса
        // нужно получить элемент, который идет перед индексом вставки
        for (int i = 0; i < index - 1; i++) {
            // перезаписываем ссылку на следующий элемент (это и есть один шаг)
            node = node.getNext();
        }
        // создаем узел для нового значения
        Node<E> newNode = new Node<>(value);
        // устанавливаем для нового узла следующим тот узел, который следующий для того который мы нашли в цикле
        newNode.setNext(node.getNext());
        // устанавливаем для того узла который нашли в цикле новый узел как следующий
        node.setNext(newNode);
        // увеличиваем размер на 1
        size++;
    }

    public E get(int index) {
        // если пустой, либо индекс не подходит, возвращаем null
        if (isEmpty() || index >= size) {
            return null;
        }
        // если размер 1, просто возвращаем значение первого узла
        if (size == 1) {
            return first.getValue();
        }
        // ссылка на первый элемент, с нее будем проходиться до последнего элемента
        Node<E> node = first;
        // делаем столько шагов, какое значение индекса
        // нужно получить элемент, который идет по этому индексу
        for (int i = 0; i < index; i++) {
            // перезаписываем ссылку на следующий элемент (это и есть один шаг)
            node = node.getNext();
        }
        return node.getValue();
    }

    public E remove(int index) {
        if (index >= size || isEmpty()) {
            return null;
        }
        Node<E> node = first;
        for (int i = 0; i < index - 1; i++) {
            node = node.getNext();
        }
        E oldValue = node.getNext().getValue();
        node.setNext(node.getNext().getNext());
        size--;
        return oldValue;
    }

    public int indexOf(E value) {
        Node<E> node = first;
        int index = 0;
        while (node.hasNext()) {
            if (node.getValue().equals(value)) {
                return index;
            }
            node = node.getNext();
            index++;
        }
        return -1;
    }

    @Override
    public Iterator<E> iterator() {
        return new MyIterator<>(first);
    }

    private static class MyIterator<E> implements Iterator<E> {
        private Node<E> current;

        public MyIterator(Node<E> first) {
            current = first;
        }

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public E next() {
            E oldValue = current.getValue();
            current = current.getNext();
            return oldValue;
        }
    }

    private static class Node<E> {
        private E value;
        private Node<E> next;

        public Node(E value, Node<E> next) {
            this.value = value;
            this.next = next;
        }

        public Node(E value) {
            this(value, null);
        }

        public boolean hasNext() {
            // если ссылка на следующий узел не нулевая, значит есть следующий элемент, метод должен вернуть истину
            return next != null;
        }

        public E getValue() {
            return value;
        }

        public void setValue(E value) {
            this.value = value;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }
}
