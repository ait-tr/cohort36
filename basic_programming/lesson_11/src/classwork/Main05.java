package classwork;

import java.util.Scanner;

public class Main05 {
    /*
    Сделать симуляцию кассы, где пользователь пишет название продукта и получает его цену
    */
    public static void main(String[] args) {
        // делаем массивы с данными
        String[] products = { "Яблоко", "Картошка", "Огурец", "Помидор", "Лук", "Виноград" };
        double[] prices = { 2, 1.5, 2.5, 3, 1, 3.5 };

        Scanner scanner = new Scanner(System.in);
        String userChoice = scanner.nextLine();
        int index = -1;
        // ищем по размеру массива цен, но сравниваем названия продуктов
        // Очевидно, работает это только если массивы одинакового размера
        // Делать так можно только если массивы тесно связаны, как в нашем случае, это наименования и цены
        for (int i = 0; i < prices.length; i++) {
            if (userChoice.equals(products[i])) {
                index = i;
                break;
            }
        }
        // индекс найденного продукта используем для того чтобы
        if (index != -1) {
            System.out.println(prices[index]);
        } else {
            System.out.println("Товара " + userChoice + " нет в магазине");
        }

    }
}
