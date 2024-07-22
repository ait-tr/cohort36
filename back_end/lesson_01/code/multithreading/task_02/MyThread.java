package multithreading.task_02;

public class MyThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 1_000_000; i++) { // when i = 999_999 last turn of cycle, 1_000_000 < 1_000_000 = false
            Counter.counter++;
        }
    }

}
