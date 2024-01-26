package classwork.example05;

public class Main {
    /*
    Разработать класс Принтер, которому можно добавлять текст для печати в очередь, а потом печатать все сразу
     */

    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.enqueue("Hello");
        printer.enqueue("This is my printer");
        printer.enqueue("I am paper");

        printer.print();
    }
}
