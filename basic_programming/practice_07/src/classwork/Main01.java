package classwork;

public class Main01 {

    public static void main(String[] args) {
        // вывести в консоль фразу I bought 2 apples for 1.50 euro
        // Количество яблок и цена должны быть записаны в переменных
        int apples = 2;
        double price = 0.75;

        System.out.println("I bought " + apples + " apples for " + apples * price + " euro");
        System.out.printf("I bought %d apples for %f euro", apples, price * apples);
    }
}
