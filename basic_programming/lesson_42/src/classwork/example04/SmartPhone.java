package classwork.example04;

public class SmartPhone implements Bluetoothable {
    private String storage;

    public SmartPhone(String storage) {
        this.storage = storage;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "storage='" + storage + '\'' +
                '}';
    }

    @Override
    public void receiveData(String data) {
        storage += data;
    }

    @Override
    public void sendData(Bluetoothable device, String data) {
        device.receiveData(data);
    }
}
