package classwork.task01;

public class Main {
    /*
    Реализовать для ранее разработанного класса MyArray Iterator чтобы использовать его с foreach циклом
     */
    public static void main(String[] args) {
        MyArray<String> greetings = new MyArray<>();
        greetings.add("Hello");
        greetings.add("Hi");
        greetings.add("Good morning");
        greetings.add("Hey");

        for (String s : greetings) {
            System.out.println(s + " world!");
        }
        /*
        // почти тоже самое
         for (int i = 0; i < greetings.size(); i++) {
            String s = greetings.get(i);
            System.out.println(s + " world!");
        }
         */

    }
}
