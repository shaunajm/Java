//Add a setter and a getter to your BankAccount class. These methods should set and retrive the balance value appropriately.

public class BankAccount
{
    
    double balance;
    public BankAccount(double n)
    {
        balance = n;
    }
    public BankAccount()
    {
        balance = 100;
    }
    public void withdraw(double amount)
    {
        balance = balance - amount;
    }
    public void deposit(double amount)
    {
        balance = balance + amount;
    }
    public String toString()
    {
        return "The balance is " + balance;
    }
    public void setBalance(double n)
    {
        balance = n;
    }
    public double getBalance()
    {
        return balance;
    }
}
