package classwork.example01;

public class Main {

    // метод для того, чтобы напечатать всю информацию про книгу в консоль
    public static void printBookInfo(Book book) {
        System.out.println(book.author + "\n" + book.title + "\n");
        System.out.println("Page format: " + book.pageFormat + ", " + book.pagesAmount + " pages\n");
        System.out.println(book.contents);
    }

    public static void main(String[] args) {
        // создаем объект книги
        Book book = new Book();
        // задаем значения для всех свойств (полей)
        book.author = "J.K. Rowling";
        book.title = "Harry Potter and Philisophers Stone";
        book.contents = "The boy who lived ....";
        book.pageFormat = "A5";
        book.pagesAmount = 400;
        // передаем объект в метод, который напечатает инфу про книгу в консоль
        printBookInfo(book);
    }
}
