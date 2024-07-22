package multithreading.task_03;

public class Counter {

    private static int counter;

    public static void main(String[] args) {

        MyThread myThread1 = new MyThread();
        MyThread myThread2 = new MyThread();

        myThread1.start();
        myThread2.start();

        for (int i = 0; i < 1_000_000; i++) {
            counterIncrement();
        }

        try {
            myThread1.join();
            myThread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Value of counter: " + counter);

    }

    // method for threads synchronization
    public static synchronized void counterIncrement() {
        counter++;
    }

}
