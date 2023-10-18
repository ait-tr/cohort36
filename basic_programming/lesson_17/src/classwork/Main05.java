package classwork;

public class Main05 {
    /*
    Задание: зашифровать вводную строку так, чтобы нельзя было прочитать изначальное сообщение
    Потом, расшифровать строку и получить сообщение обратно
     */

    public static char[] encrypt(char[] str) {
        // массив-результат, такой же длинны как и входная строка
        char[] res = new char[str.length];
        for (int i = 0; i < str.length; i++) {
            // смещаем каждый символ на 3 вперед, чтобы зашифровать строку
            res[i] = (char) (str[i] + 3);
        }
        return res;
    }

    public static char[] decrypt(char[] str) {
        // массив-результат, такой же длинны как и входная строка
        char[] res = new char[str.length];
        for (int i = 0; i < str.length; i++) {
            // смещаем каждый символ на 3 назад (тоже самое что в шифровании, только наоборот) чтобы расшифровать строку
            res[i] = (char) (str[i] - 3);
        }
        return res;
    }

    public static void main(String[] args) {
        String textStr = "Hello world!";
        // выводим начальную строку
        char[] text = textStr.toCharArray();
        System.out.println(text);
        // шифруем и выводим зашифрованную строку
        char[] encryptedText = encrypt(text);
        System.out.println(encryptedText);
        // расшифруем зашифрованную строку и выведем ее. Она будет такой же, как и исходная
        char[] decryptedText = decrypt(encryptedText);
        System.out.println(decryptedText);
    }
}
