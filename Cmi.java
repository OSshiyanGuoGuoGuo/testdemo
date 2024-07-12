public class Cmi1 {
    public static void main(String[] args) {
        
        BankAccount account1 = new BankAccount("12345678",9999.0);  // 函数调用参数发生变更
        BankAccount account2 = new BankAccount("87654321"); //同名函数调用替换
        
        account2.deposit(500.0);  // 函数调用base变量变更
        account2.withdraw(200.0);  // 函数调用base变量变更
        // 删除函数调用
        
        System.out.println("account1 current balance: $" + account1.getBalance());
        System.out.println("account2 current balance: $" + account2.getBalance());

        System.out.println(account2.getBalance()); // 增加函数调用
    }
}



