package Homework_01.task_02_multi_threads;

class CounterThread extends Thread {
  private final int min;
  private final int max;
  private int counter;

  public CounterThread(int min, int max) {
    this.min = min;
    this.max = max;
  }

  @Override
  public void run() {
    for (int i = min; i <= max; i++) {
      if (i % 21 == 0 && Pathfinder.containsDigitThree(i)) {
        counter++;
      }
    }
  }

  public int getCounter() {
    return counter;
  }
}