package homework_01;

public class MyThread extends Thread {

    private final int rangeStart;
    private final int rangeEnd;

    public MyThread(int rangeStart, int rangeEnd) {
        this.rangeStart = rangeStart;
        this.rangeEnd = rangeEnd;
    }

    @Override
    public void run() {
        for (int i = rangeStart; i <= rangeEnd; i++) {
            if (i % 21 == 0 && String.valueOf(i).contains("3")) {
                Counter.incrementCounter();
            }
        }
    }
}