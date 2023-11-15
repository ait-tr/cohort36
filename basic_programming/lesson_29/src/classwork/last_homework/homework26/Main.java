package classwork.last_homework.homework26;

public class Main {
    public static void printProcessorInfo(Processor processor) {
        System.out.println("Manufacturer: " + processor.manufacturer);
        System.out.println("Series: " + processor.series);
        System.out.println("Speed: " + processor.speed + " GHz");
        System.out.println("Cores: " + processor.cores);
        System.out.println("Threads: " + processor.threads);
        System.out.println("Cash memory: " + processor.cashMemory + " kB");
    }

    public static void main(String[] args) {
        Processor proc = new Processor("AMD", "Ryzen 5 5600", 3.5, 6, 12, 32000);
        printProcessorInfo(proc);
    }
}
