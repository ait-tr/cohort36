package classwork.last_homework;

public class Main02_33 {

    public static char[] alphabet() {
        char[] res = new char[26];
        for (int i = 0; i < res.length; i++) {
            res[i] = (char)(i + 97);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.print(alphabet());
    }
}
