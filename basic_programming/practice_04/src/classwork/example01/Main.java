package classwork.example01;

public class Main {
    /*
    Создать интерфейс, который позволит студенту, выполняющему задание, подписать свою работу
     */

    public static void main(String[] args) {
        StudentInfo.signer.sign();
        System.out.println("Остальная работа здесь...");
    }
}
