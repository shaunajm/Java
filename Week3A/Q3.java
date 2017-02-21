//Add a withdraw method to your BankAccount class. It will represent a withdrawal from your account and so the balance should be reduced appropriate

public class BankAccount
{
    
    double balance;
    public BankAccount(double n)
{
    balance = n;
        
    }
    public void withdraw(double amount)
    {
        balance = balance - amount;
        
    }
}
