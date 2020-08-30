package bankaccountapp;

public abstract class Account implements IBaseRate{
 
	String name;
	String ssn;
	double balance;
	protected String accNum;
	public double rate;
	
	private static int index=10000;


	public Account(String name, String ssn, double initDeposit) {
		
		 this.name=name;
		 this.ssn=ssn;
		 balance=initDeposit;
//		 System.out.println("Name: "+name);
//		 System.out.println("SSN: "+ssn);
//		 System.out.println("Balance: "+balance);
		 
		 index++;
		 this.accNum=setAccountNumber();
		 //System.out.println("baseRate: "+getBaseRate());
		 setRate();
	}
	public abstract void setRate();
	
	
	
	

	private String setAccountNumber()
	{
		String lastTwoSsn=ssn.substring(ssn.length()-2,ssn.length());
		int uniqueID=index;
		int rand=(int)(Math.random()*Math.pow(10, 3));
		return lastTwoSsn+uniqueID+rand;
	}
	
	public void compound()
	{
		double accruedInterest=balance*(rate/100);
		balance+=accruedInterest;
		System.out.println("Accrued Interest: Rs " + accruedInterest);
	    printBalance();
	}
	
	public void deposit(double amount)
	{
		balance+=amount;
		System.out.println("Depositing: "+amount);
		printBalance();
	}
	
	public void withdrawn(double amount)
	{
		balance=balance-amount;
		System.out.println("Withdrawing: "+amount);
		printBalance();
	}
	
	public void transfer(String toWhere, double amount)
	{
		balance=balance-amount;
		System.out.println("Transfering Rs."+amount+" to "+ toWhere);
		printBalance();
	}
	
	public void printBalance()
	{
		System.out.println("Current Balance: "+balance);	
	}
	public void showInfo()
	{
		 System.out.println("Name: "+name);
		 //System.out.println("SSN: "+ssn);
		 System.out.println("Balance: "+balance);
		 System.out.println("Account Number: "+accNum);
		 System.out.println("Rate: "+rate+"%");
	}
	
}
