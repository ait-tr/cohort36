package Homework_01.task_02_multi_threads;

public class Pathfinder {
  public static void main(String[] args) throws InterruptedException {
    int min = 21;
    int max = 2_000_000;
    int mid = (min + max) / 2;

    CounterThread thread1 = new CounterThread(min, mid);
    CounterThread thread2 = new CounterThread(mid + 1, max);

    thread1.start();
    thread2.start();

    thread1.join();
    thread2.join();

    int totalCounter = thread1.getCounter() + thread2.getCounter();
    System.out.println("From " + min + " to " + max + ", I found " + totalCounter +
        " numbers that correspond to the condition.");
  }

  public static boolean containsDigitThree(int number) {
    while (number > 0) {
      if (number % 10 == 3) {
        return true;
      }
      number /= 10;
    }
    return false;
  }
}


