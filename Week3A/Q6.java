//Add a toString method to your BankAccount class. It should return a string representing the account. The string should be exactly "The balance is ..."

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
}
