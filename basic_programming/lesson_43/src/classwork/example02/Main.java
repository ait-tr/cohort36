package classwork.example02;

public class Main {
    /*
    Написать систему отпраления уведомлений по СМС, почте и телеграм
     */
    public static void main(String[] args) {
        Notifier notifier = new SMSNotifier();
        NotificationManager manager = new NotificationManager();
        manager.broadcastMessage(notifier, "This is a SMS message!");

        notifier = new EmailNotifier();
        manager.broadcastMessage(notifier, "This is an email letter!");
    }
}
