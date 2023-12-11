package classwork.last_homework.homework37;

public class Remote {

    private final double frequency;

    public Remote(double frequency) {
        this.frequency = frequency;
    }

    public double getFrequency() {
        return frequency;
    }

    public void swichChannelForward(Tv tv) {
        if (frequency == tv.getFrequency()) {
            tv.setCurrentChanel(tv.getCurrentChanel() + 1);
        }

    }

    public void swichChannelBackwards(Tv tv) {
        if (frequency == tv.getFrequency()) {
            tv.setCurrentChanel(tv.getCurrentChanel() - 1);
        }

    }

    public void setChanelManually(Tv tv, int channel) {
        if (frequency == tv.getFrequency()) {
            tv.setCurrentChanel(channel);

        }
    }
}
