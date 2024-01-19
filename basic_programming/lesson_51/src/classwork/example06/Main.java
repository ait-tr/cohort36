package classwork.example06;

public class Main {
    public static String splitInParts(String s, int partLength) {
        StringBuilder sb = new StringBuilder();
        // проходим по всем символам строки
        for (int i = 0; i < s.length(); i++) {
            // добавляем символ
            sb.append(s.charAt(i));
            // если кратное размеру части, вставляем пробел
            if (i != 0 && (i + 1) % partLength == 0) {
                sb.append(" ");
            }
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        String ans = splitInParts("supercalifragilisticexpialidocious", 3);
        System.out.println(ans);
    }
}
