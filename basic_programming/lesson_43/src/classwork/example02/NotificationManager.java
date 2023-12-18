package classwork.example02;

public class NotificationManager {
    public void broadcastMessage(Notifier notifier, String message) {
        notifier.sendNotification(message);
    }
}
