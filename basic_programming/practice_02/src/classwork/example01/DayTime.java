package classwork.example01;

public class DayTime {
    private Hour hour;
    private Minute minute;

    public DayTime(int hour, int minute) {
        this.hour = new Hour(hour);
        this.minute = new Minute(minute);
    }

    public void setHour(int hour) {
        this.hour.setValue(hour);
    }
    public int getHour() {
        return hour.getValue();
    }

    public void setMinute(int minute) {
        this.minute.setValue(minute);
    }
    public int getMinute() {
        return minute.getValue();
    }
}
