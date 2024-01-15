package classwork.task02;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<String> list = new MyLinkedList<>();
        list.add("Hello");
        list.add("Hi");
        list.add("Good morning");
        list.add("Hey");

        list.remove(2);

        for (String s : list) {
            System.out.println(s + " world!");
        }
    }
}
