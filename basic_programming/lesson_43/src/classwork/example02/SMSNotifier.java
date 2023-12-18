package classwork.example02;

public class SMSNotifier implements Notifier {
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending an SMS with text: " + message);
        // Здесь нужно было бы написать код, который реально делает это действие
    }
}
