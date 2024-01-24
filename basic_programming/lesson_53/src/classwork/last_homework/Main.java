package classwork.last_homework;

import java.util.Arrays;

public class Main {
    public static byte[] parseIp(String ip) {
        String[] bytesStr = ip.split("\\.");
        if (bytesStr.length != 4) {
            throw new IllegalArgumentException("Ip should consist of 4 numbers!");
        }
        byte[] bytes = new byte[4];
        for (int i = 0; i < bytes.length; i++) {
            int val;
            try {
                val = Integer.parseInt(bytesStr[i]);
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException(e);
            }
            if (val < 0 || val > 255) {
                throw new IllegalArgumentException("Numbers should be in range 0..255");
            }
            bytes[i] = (byte) (val - 128);
        }
        return bytes;
    }

    public static String encrypt(String text) {
        StringBuilder sb = new StringBuilder();
        for (char ch : text.toCharArray()) {
            sb.append((char) (ch + 3));
        }
        return sb.toString();
    }

    public static String decrypt(String data) {
        StringBuilder sb = new StringBuilder();
        for (char ch : data.toCharArray()) {
            sb.append((char) (ch - 3));
        }
        return sb.toString();
    }

    public static boolean isEmail(String email) {
        return email.matches("[a-zA-Z0-9._]+(\\+[a-zA-Z0-9._]+)?@[a-zA-Z0-9._]+");
    }

    public static String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    public static boolean isPalindrome(String s) {
        s = s.toLowerCase().replace("[^a-z]", "");
        return reverse(s).equals(s);
    }

    public static String reverseWord(String s) {
        StringBuilder sb = new StringBuilder();
        String[] words = s.split(" ");
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]).append(" ");
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(parseIp("168.192.1.12")));
        System.out.println(isEmail("i.o.tkachov+github@gmail.com"));
    }
}
