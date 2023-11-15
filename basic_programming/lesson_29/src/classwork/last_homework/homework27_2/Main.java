package classwork.last_homework.homework27_2;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("1234 5678 9101 1123");
        bankAccount.deposit(200);
        System.out.println("Money in account " + bankAccount.getNumber() +
                " is " + bankAccount.getMoney());
        bankAccount.withdraw(400);
        System.out.println("Money in account " + bankAccount.getNumber() +
                " is " + bankAccount.getMoney());
        bankAccount.withdraw(150);
        System.out.println("Money in account " + bankAccount.getNumber() +
                " is " + bankAccount.getMoney());
    }
}
