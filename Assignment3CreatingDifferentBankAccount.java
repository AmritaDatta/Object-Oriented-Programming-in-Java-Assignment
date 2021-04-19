package assignment3creatingdifferentbankaccount;

import java.util.Scanner;

public class Assignment3CreatingDifferentBankAccount {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("Which type of ACCOUNT do you want to create??????????");
        String accountType = in.next();
        
        //Runtien polymorphism        
        Account account;
        
        if (accountType.equalsIgnoreCase("SB"))
            account = new SBAccount();
        else
            account = new CurrentAccount();
        
        
        System.out.println("Enter account number...");
        account.accountNumber = in.nextLong();
		
		
	System.out.println("Enter Name...");
	account.name = in.next ();
	
        System.out.println("Enter First Deposit...");
	float amount = in.nextFloat();
        
        account.displayAccountDetails();
        account.deposit(amount);
        account.deposit(2000);
        account.withdraw(1000);
        
        
        account.displayBalance(); 
    }
}