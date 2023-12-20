package classwork.last_homework.task1;

public class Main {
    public static void main(String[] args) {
        Mouse mouse1 = new Mouse("Bloody J90S", "Black", true, true, 9, 2400);
        Mouse mouse2 = new Mouse("Bloody J90S", "Black", true, true, 9, 2400);
        System.out.println(mouse1.equals(mouse2));

        mouse2.setButtons(7);
        System.out.println(mouse1.equals(mouse2));

    }
}
