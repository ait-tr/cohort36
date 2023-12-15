package classwork.example04;

public interface Bluetoothable {
    void receiveData(String data);

    void sendData(Bluetoothable device, String data);
}
