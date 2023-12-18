package classwork.example02;

public class EmailNotifier implements Notifier {
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending an email with text: " + message);
        // Здесь нужно было бы написать код, который реально делает это действие

    }
}
