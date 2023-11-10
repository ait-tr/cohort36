package classwork.last_homework.task02_25;

public class Main {
    public static void main(String[] args) {
        Pen pen = new Pen();
        pen.checkInk();
        pen.write("Hello, im writing with this pen"); // привет, я пишу этой ручкой
        pen.checkInk();
        pen.write("And now im gonna refill it"); // и теперь я пополню чернила
        pen.checkInk();
        pen.refill();
        pen.checkInk();
    }
}
