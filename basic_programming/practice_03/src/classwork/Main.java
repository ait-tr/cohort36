package classwork;

public class Main {
    public static void main(String[] args) {
        Human eve = new Human("Eve", false);
        Human son = eve.giveBirth("Cain");
        System.out.println(eve);
        System.out.println(son);
    }
}
