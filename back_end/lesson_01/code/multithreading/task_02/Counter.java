package multithreading.task_02;

public class Counter {

    public static int counter;

    public static void main(String[] args) {

        MyThread myThread1 = new MyThread(); // create object myThread1 based on class MyThread
        MyThread myThread2 = new MyThread(); // create object myThread1 based on class MyThread

         myThread1.start(); // this thread inside main
         myThread2.start(); // this thread inside main

        for (int i = 0; i < 1_000_000; i++) {
            counter++;
        }

        // How many threads are running?
        // main - is thread also
        try {
            myThread1.join(); // myThread1 join to main
            myThread2.join(); //  myThread2 join to main
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Value of counter: " +  counter);
        // у нас конкуренция за процессор (за ресурс)

    }
}
