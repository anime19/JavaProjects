package bankaccountapp;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {
	
	
	public static void main(String[] args) throws IOException {
		List<Account> accounts =new LinkedList<Account>();
		
		
		
		
		String file="F:\\java\\NewBankAccounts.csv";
		
	/*
		Checking  chkacc1=new Checking("Bill Gates","123456789",2500.0);
	
	Savings savacc1=new Savings("Steve Jobs","543219876",3500.0);
        
	//savacc1.
	
	savacc1.showInfo();
	
	System.out.println();
	System.out.println("**************");
	
	System.out.println();
	
	chkacc1.showInfo(); 
	
	//savacc1.deposit(5000);
	//savacc1.withdrawn(281);
	//savacc1.transfer("XYZ",500);
	
	savacc1.compound();
	*/
		List<String[]> newAccountHolder=utilities.CSV.read(file);
	for(String [] accountHolder: newAccountHolder) {
		System.out.println("NEW ACCOUNT");
		String name=accountHolder[0];
		String ssn=accountHolder[1];
		double initDeposit=Double.parseDouble(accountHolder[3]);
		String accountType=accountHolder[2];
	 
		System.out.println(name+ " "+ ssn + " "+accountType+" "+initDeposit);
	     if(accountType.equals("Savings")) {
	    	// System.out.println("OPEN SAVINGS ACCOUNT");
	         accounts.add(new Savings(name,ssn,initDeposit));
	     }
	     else if (accountType.equals("Checking")) {
	    // System.out.println("OPEN A CHECKING ACCOUNT");
	     accounts.add(new Checking(name,ssn,initDeposit));
	     }
	     else
	    	 System.out.println("Error 404");
	}
	
	   for(Account acc:accounts) {
		   System.out.println("****************");
		   acc.showInfo();
	   }
	   
	}

}
