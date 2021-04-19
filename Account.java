package assignment3creatingdifferentbankaccount;

abstract public class Account {
    
    long accountNumber; 
    String name;
    float balance;  
    
    public abstract void deposit(float amount);
    public abstract void withdraw(float amount);
    
    public void displayAccountDetails(){
        System.out.println("Display Account Details: ");
        System.out.println("Account No.: " + accountNumber);
        System.out.println("Name: " + name);
    }
    
    public void displayBalance(){
        System.out.println("Balance is: " + balance);
    }
}
