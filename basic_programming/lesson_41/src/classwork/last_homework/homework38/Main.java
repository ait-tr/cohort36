package classwork.last_homework.homework38;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Seller seller = new Seller("John");
        Customer customer = new Customer("Daniel", 100);
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int amount = scanner.nextInt();
        customer.buyProduct(seller, name, amount);
    }
}
