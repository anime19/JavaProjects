package bankaccountapp;

public class Savings extends Account {
	
	 private int safetyBoxId;
	 private int safetyBoxKey;
	public Savings(String name, String ssn, double initDeposit) {
		super(name,ssn,initDeposit);
		accNum="1"+accNum;
		setSafetyDepositBox();
		 
	}
	@Override
	  public void setRate()
	  {
		 rate=getBaseRate()-0.25;
	  }
	
	private void setSafetyDepositBox()
	{
		safetyBoxId=(int)(Math.random()*Math.pow(10, 3));
		safetyBoxKey=(int)(Math.random()*Math.pow(10, 4));
	}
	
	public void showInfo()
	  {
		//System.out.println("ACCOUNT TYPE: Savings" );
		  super.showInfo();
		  System.out.println("Your Savings Account Details"+
		  "\n Safety Deposit Box ID: "+safetyBoxId+
		  "\n Safety Deposit Box key: "+safetyBoxKey);
		  
	  }
	

}
