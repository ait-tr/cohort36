package classwork.last_homework.homework37;

public class Tv {

    private double frequency;
    private int currentChanel;


    public Tv(double frequency, int currentChanel) {
        this.frequency = frequency;
        this.currentChanel = currentChanel;
    }

    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    public int getCurrentChanel() {
        return currentChanel;
    }

    public void setCurrentChanel(int currentChanel) {
        if (currentChanel >= 1 && currentChanel <= 99) {
            this.currentChanel = currentChanel;
        } else if (currentChanel == 0) {
            this.currentChanel = 99;
        } else if (currentChanel == 100) {
            this.currentChanel = 1;
        } else {
            System.out.println("chanel don't exist");
        }
    }
}
