package homework_01;

public class Counter {

    private static int counter;

    public static synchronized void incrementCounter() {
        counter++;
    }

    public static void main(String[] args) {
        singleThreadSolution();
        counter = 0;
        twoThreadsSolution();
    }

    public static void singleThreadSolution() {
        MyThread myThread = new MyThread(1, 2_000_000);
        myThread.start();

        try {
            myThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Counter value with single thread: " + counter);
    }

    public static void twoThreadsSolution() {
        MyThread myThread1 = new MyThread(1, 1_000_000);
        MyThread myThread2 = new MyThread(1_000_001, 2_000_000);

        myThread1.start();
        myThread2.start();

        try {
            myThread1.join();
            myThread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Counter value with two threads:   " + counter);
    }
}