package multithreading.task_04;

public class MyThread2Runnable  implements Runnable{

    @Override
    public void run() {
        for (int i = 10000; i <10010 ; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
