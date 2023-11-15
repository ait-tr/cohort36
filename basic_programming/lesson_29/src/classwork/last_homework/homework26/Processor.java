package classwork.last_homework.homework26;

public class Processor {
    public String manufacturer;
    public String series;
    public double speed; // in GHz
    public int cores;
    public int threads;
    public int cashMemory; // in kB

    public Processor(String manufacturer, String series, double speed, int cores, int threads, int cashMemory) {
        this.manufacturer = manufacturer;
        this.series = series;
        this.speed = speed;
        this.cores = cores;
        this.threads = threads;
        this.cashMemory = cashMemory;
    }

}
