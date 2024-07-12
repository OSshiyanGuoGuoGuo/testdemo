public class Cmi {
    public static void main(String[] args) {

        BankAccount account1 = new BankAccount("12345678", 1000.0);
        BankAccount account2 = new BankAccount("87654321", 2000.0);

        account1.deposit(500.0);
        account1.withdraw(200.0);
        account1.withdraw(2000.0);

        System.out.println("account1 current balance: $" + account1.getBalance());
        System.out.println("account2 current balance: $" + account2.getBalance());
    }
}
