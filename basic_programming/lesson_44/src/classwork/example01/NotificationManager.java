package classwork.example01;

public class NotificationManager {
    private void broadcastMessage(Notifier notifier, String message) {
        notifier.sendNotification(message);
    }

    public void broadcastEmailMessage(String message) {
        // создаем уведомитель, который будет передавать наше сообщение
        Notifier notifier = new Notifier() {
            // с помощью анонимного класса указываем именно для этого объекта реализацию метода
            @Override
            public void sendNotification(String message) {
                System.out.println("Sending email with text: " + message);
                // сюда нужно написать код, который реально отсылает письмо
            }
        };
        // вызываем другой метод, чтобы отправить само сообщение
        broadcastMessage(notifier, message);
    }

    public void broadcastSmsMessage(String message) {
        Notifier notifier = new Notifier() {
            @Override
            public void sendNotification(String message) {
                System.out.println("Sending sms with text: " + message);
                // сюда нужно написать код, который реально отсылает письмо
            }
        };
        broadcastMessage(notifier, message);
    }

    public void broadcastTelegramMessage(String message) {
        Notifier notifier = new Notifier() {
            @Override
            public void sendNotification(String message) {
                System.out.println("Sending telegram message with text: " + message);
                // сюда нужно написать код, который реально отсылает письмо
            }
        };
        broadcastMessage(notifier, message);
    }

    public void broadcastEverywhere(String message) {
        broadcastTelegramMessage(message);
        broadcastEmailMessage(message);
        broadcastSmsMessage(message);
    }
}
