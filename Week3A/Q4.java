//Add a deposit method to your BankAccount class. It will represent a deposit to your account and so the balance should be increased appropriately.
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
    public void deposit(double amount)
    {
        balance = balance + amount;
        
    }
}
