//The MIA Bank has a special offer for all new accounts. It sets the initial balance to 100.00. Add a default (no args) constructor for the MIA bank which initialises the balance to 100.00.

public class BankAccount.java
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
        deposit = deposit - amount;
        
    }
}
