package assignment3creatingdifferentbankaccount;

public final class SBAccount extends Account{
    
    final float minimumBalance = 5000;
    int months=1;
    
    @Override
    public void deposit(float amount){
        balance = balance + amount;
        System.out.println("Euro " + amount + " has been Credited | Balance: " + balance);
    }
    
    @Override
    public void withdraw(float amount){
        
        if(balance > amount){
            if (minimumBalance>amount){
            
            balance -= amount;
            
            balance += balance * (months*0.04);
            System.err.println("Euro " + amount + " has been Debited | After Interest: Balance is: " + balance);
            }
        }
        else {
            System.out.println("Erro: Insufficient balance");
        }
    }
}