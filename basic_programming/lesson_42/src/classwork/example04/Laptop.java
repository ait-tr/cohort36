package classwork.example04;

public class Laptop implements Bluetoothable {
    private String disk;

    public Laptop(String disk) {
        this.disk = disk;
    }

    public String getDisk() {
        return disk;
    }

    public void setDisk(String disk) {
        this.disk = disk;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "disk='" + disk + '\'' +
                '}';
    }

    @Override
    public void receiveData(String data) {
        disk += data;
    }

    @Override
    public void sendData(Bluetoothable device, String data) {
        device.receiveData(data);
    }
}
