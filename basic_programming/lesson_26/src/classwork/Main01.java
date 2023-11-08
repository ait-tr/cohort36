package classwork;

public class Main01 {

    /*
    FizzBuzz processor
    Напечатать цифры от 1 до 100
    Вместо цифр, которые делятся на 3 нацело, напечатать Fizz
    Вместо цифр, которые делятся на 5 нацело, напечатать Buzz
    Вместо цифр, которые делятся и на 3 и на 5 напечатать FizzBuzz
     */

    public static void main(String[] args) {
        // идем от 1 до 100
        for (int i = 1; i <= 100; i++) {
            // если число делится на 3, выводим физз
            if (i % 3 == 0) {
                System.out.print("Fizz");
            }
            // если число делится на 5, выводим базз
            if (i % 5 == 0) {
                System.out.print("Buzz");
            }
            // если число не делится на 3 и 5, выводим само число
            if (i % 3 != 0 && i % 5 != 0) {
                System.out.print(i);
            }
            // в конце итерации, выводим пробел чтобы все не сливалось в одну строку
            System.out.print(" ");
        }
        /*
    // Идею решения предложил Борис Юрчук:
    for (int i = 1; i <= 100; i++) {
            String res = "";
            if (i % 3 == 0) {
                res += "Fizz";
            }
            if (i % 5 == 0) {
                res += "Buzz";
            }
            if (res.equals("")) {
                System.out.print(i + " ");
            } else {
                System.out.print(res + " ");
            }
        }
     */
    }

}
