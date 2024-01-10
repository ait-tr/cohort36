package classwork.task03;

public class Box<T> {
    private T contents;

    public Box() {
        contents = null;
    }

    public boolean isEmpty() {
        return contents == null;
    }

    public boolean put(T object) {
        if (!isEmpty()) {
            return false;
        }
        contents = object;
        return true;
    }

    public T take() {
        if (isEmpty()) {
            return null;
        }
        T oldContents = contents;
        contents = null;
        return oldContents;
    }
}
