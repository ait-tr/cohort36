package classwork;

import java.util.Scanner;

public class Main03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = -1;
        int attempts;
        // в цикле for можно использовать абсолютно любые условия, даже если они не относятся к переменным, использованным
        // в других строках внутри круглых скобок
        // главное - чтобы цикл не был бесконечным
        for (attempts = 0; number <= 0; attempts++) {
            System.out.println("Enter natural number");
            number = scanner.nextInt();
        }

        System.out.println("Your natural number: " + number + ", attempts: " + attempts);
    }
}
