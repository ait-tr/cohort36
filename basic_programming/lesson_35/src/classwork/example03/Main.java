package classwork.example03;

public class Main {
    public static void main(String[] args) {
        // создаем объект
        Material brick = new Material(5, "Hardened clay brick", "Building materials", 45000, 654656);
        // выводим цену до применения скидки
        System.out.println("Price: " + brick.getPrice());
        // устанавливаем скидку 20%
        brick.discount(20);
        // выводим цену после скидки
        System.out.println("Price with sale: " + brick.getPrice());
        // убираем скидку
        brick.discount(0);
        // выводим цену после отмены скидки
        System.out.println("Price without discount: " + brick.getPrice());

    }
}
