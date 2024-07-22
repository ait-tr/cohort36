package multithreading.task_04;

public class MyThread1Extends extends Thread {

    public void run(){
        for (int i = 100; i < 110 ; i++) {
            System.out.println(getName() + " " + i);

            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
