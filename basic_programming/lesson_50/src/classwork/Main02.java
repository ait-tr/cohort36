package classwork;

public class Main02 {
    public static void main(String[] args) {
        String hello = "Hello world!";
        System.out.println("String: " + hello);
        System.out.println("Length: " + hello.length());
        System.out.println("Char at index 3: " + hello.charAt(3));
        System.out.println("Upper case: " + hello.toUpperCase());
        System.out.println("Lower case: " + hello.toLowerCase());
        System.out.println("Original string: " + hello);
        System.out.println("This string from 3 index to 9 index: "
                + hello.substring(3, 9));
        System.out.println("This string from 4 index: "
                + hello.substring(4));

        System.out.println("This string contains Hello: "
                + hello.contains("Hello"));
        System.out.println("This string contains goodbye: "
                + hello.contains("goodbye"));
        System.out.println("This string ends with world!: "
                + hello.endsWith("world!"));
        System.out.println("This string ends with goodbye: "
                + hello.endsWith("goodbye"));
        System.out.println("Equals ignore case: "
                + hello.equalsIgnoreCase("hello WORLD!"));
        //System.out.println(hello.indent(10));
        System.out.println("Index of first letter o: "
                + hello.indexOf('o'));
        System.out.println("Index of first letter o after 5 symbols: "
                + hello.indexOf('o', 5));
        System.out.println("This string if it was a password: "
                + "*".repeat(hello.length()));
        System.out.println("This string with * instead of 1st char: "
                + hello.replace(hello.charAt(0), '*'));
    }
}
