package classwork.example02;

public class TelegramNotifier implements Notifier {
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending telegram message with text: " + message);
        // Здесь нужно было бы написать код, который реально делает это действие
    }
}
