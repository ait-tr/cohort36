package Homework_01.task_01_one_thread;

public class Pathfinder {

  public static void main(String[] args) {

    int min = 21;
    int max = 2_000_000;
    int counter = 0;
    for (int i = min; i <= max; i++) {
      if (i % 21 == 0 && containsDigitThree(i)) {
        counter++;
      }
    }
    System.out.println("From 0 to " + max + ", I found " + counter + " numbers that correspond to both conditions.");
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
