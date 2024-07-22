package multithreading.task_04;

public class Counter {

    public static void main(String[] args) {
        // 1-й способ
        MyThread1Extends myThread1Extends = new MyThread1Extends();

        // 1-й способ, на основе Runnable
        MyThread2Runnable myThread2Runnable = new MyThread2Runnable();
        Thread thread = new Thread(myThread2Runnable);

        thread.setDaemon(true); // работает в фоновом режиме

        myThread1Extends.start();
        thread.start();

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
