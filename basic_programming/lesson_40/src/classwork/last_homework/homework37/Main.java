package classwork.last_homework.homework37;

public class Main {

    public static void printInfo(Tv tv) {
        System.out.println("you are watching channel " + tv.getCurrentChanel());

    }

    public static void main(String[] args) {
        Tv tv = new Tv(4.5, 99);
        Remote remote = new Remote(4.5);
        printInfo(tv);
        remote.swichChannelForward(tv);
        printInfo(tv);
        remote.swichChannelBackwards(tv);
        printInfo(tv);
        remote.setChanelManually(tv,25);
        printInfo(tv);
        remote.setChanelManually(tv,-1);
        printInfo(tv);

    }
}
