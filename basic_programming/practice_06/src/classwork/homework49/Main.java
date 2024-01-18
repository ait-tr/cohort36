package classwork.homework49;

public class Main {
    public static void main(String[] args) {
        try {
            MyArray<String> strings = new MyArray<>(null);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        MyArray<String> strings = new MyArray<>(new String[]{"byte", "short", "int"});

        try {
            strings.add(10, "long");
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

        try {
            strings.remove(-5);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
