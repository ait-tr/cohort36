package classwork;

import java.util.Random;
import java.util.Scanner;

public class Main01 {

    /*
     Сделать игру "камень ножницы бумага"
     */

    public static String whoWon(String pick, String userPick) {
        switch (pick + userPick) {
            case "каменьножницы":
            case "ножницыбумага":
            case "бумагакамень":
                return "Компьютер выиграл";
            case "каменьбумага":
            case "ножницыкамень":
            case "бумаганожницы":
                return "Пользователь выиграл";
        }
        return "ничья";
        /*switch (pick) {
            case "камень":
                if (userPick.equals("ножницы")) {
                    return "Компьютер выиграл";
                } else if (userPick.equals("бумага")) {
                    return "Пользователь выиграл";
                }
                break;
            case "ножницы":
                if (userPick.equals("бумага")) {
                    return "Компьютер выиграл";
                } else if (userPick.equals("камень")) {
                    return "Пользователь выиграл";
                }
                break;
            case "бумага":
                if (userPick.equals("камень")) {
                    return "Компьютер выиграл";
                } else if (userPick.equals("ножницы")) {
                    return "Пользователь выиграл";
                }
                break;
        }
        return "Ничья";*/
    }

    public static void main(String[] args) {
        String[] answers = {"камень", "ножницы", "бумага"};
        int index = new Random().nextInt(0, answers.length);
        String pick = answers[index];
        Scanner scanner = new Scanner(System.in);
        String userPick = scanner.next();
        System.out.println(pick);

        System.out.println(whoWon(pick, userPick));
    }
}
