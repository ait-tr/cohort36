package classwork.example01;

public class Main {
    /*
    Написать систему отправления уведомлений по СМС, почте и телеграм
     */
    public static void main(String[] args) {
        NotificationManager manager = new NotificationManager();
        manager.broadcastEverywhere("This is notification from our company!");
    }
}
