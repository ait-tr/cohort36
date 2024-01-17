package classwork;

import java.util.Scanner;

public class Main03 {
    /*
    Перевести переданный текст в нижний регистр
    Все большие буквы должны стать маленькими, а маленькие - большими
     */

    public static String changeCase(String text) {
        StringBuilder sb = new StringBuilder();
        // проходим по всей строке
        for (Character ch : text.toCharArray()) {
            // если буква нижнего регистра, поменять на верхний
            if (Character.isLowerCase(ch)) {
                sb.append(Character.toUpperCase(ch));
            } else {
                // в другом случае, поменять на нижний
                sb.append(Character.toLowerCase(ch));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text: ");
        String text = scanner.nextLine();
        System.out.println(changeCase(text));
    }
}
