package classwork;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main03 {
    /*
    Переделать программу "касса" из урока 11 еще раз, используя HashMap
     */
    public static void main(String[] args) {
        Map<String, Double> products = new HashMap<>();
        products.put("Яблоко", 2.0);
        products.put("Картошка", 1.5);
        products.put("Огурец", 2.5);
        products.put("Помидор", 3.0);
        products.put("Лук", 1.0);
        products.put("Виноград", 3.5);

        Scanner scanner = new Scanner(System.in);
        String userChoice = scanner.nextLine();

        if (products.containsKey(userChoice)) {
            System.out.println("Цена: " + products.get(userChoice));
        } else {
            System.out.println("Товара " + userChoice + " нет в магазине");

            System.out.println("Товары которые есть:");

            // тип будет Map.Entry<String, Double>
            for (var entry : products.entrySet()) {
                System.out.println(entry.getKey() + ", цена: " + entry.getValue());
            }
            /*
            for (String key : products.keySet()) {
                System.out.println(key + ", цена: " + products.get(key));
            }
             */
        }
    }
}
