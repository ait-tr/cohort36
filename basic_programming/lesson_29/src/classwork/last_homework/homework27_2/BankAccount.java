package classwork.last_homework.homework27_2;

public class BankAccount {
    private String number;
    private double money;

    public BankAccount(String number) {
        this.number = number;
        this.money = 0;
    }

    public String getNumber() {
        return number;
    }

    public double getMoney() {
        return money;
    }

    public void deposit(double amount) {
        money += amount;
    }

    public void withdraw(double amount) {
        if (money >= amount) {
            money -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }
}
