
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // write your program here
        
        Account matthew = new Account ("Matthews account", 1000.00);
        Account user = new Account ("My account", 0.00);
        
        // Withdraw 100.00 from matthew
        matthew.withdrawal(100.00);
        
        // Deposit 100.00 to user
        user.deposit(100.00);
        
        System.out.println(matthew);
        System.out.println(user);
    }
}
