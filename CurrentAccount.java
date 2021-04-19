package assignment3creatingdifferentbankaccount;

public final class CurrentAccount extends Account{
    
    final float minimumBalance = 1000;
    
    @Override
    public void deposit(float amount){
        balance += amount;
        System.out.println("Euro " + amount + " has been Credited | Balance: " + balance);
    }
    
    @Override
    public void withdraw(float amount){

        //if(balance > amount){
           // if (minimumBalance > amount){
                
                balance = balance - amount;
                
                System.out.println("Euro " + amount + " Debited | Current Balance: " + balance);
            //}
        //}
        //else {
        //    System.out.println("Erro: Insufficient balance");
        //}
    }   
}
