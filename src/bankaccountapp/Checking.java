package bankaccountapp;

public class Checking extends Account{
	
	private int debitNum;
	private int debitPin;
	
  public Checking(String name, String ssn, double initDeposit)
  {
	   super(name,ssn,initDeposit);
	   accNum="2"+accNum;
	   setDebitCard();
	 

  }
  
  @Override
  public void setRate()
  {
	  rate=getBaseRate()*0.15;
  }
  
  private void setDebitCard()
  {
	  debitNum=(int)(Math.random()*Math.pow(10, 12));
	  debitPin=(int)(Math.random()*Math.pow(10, 4));;
  }
  
  public void showInfo()
  {
	  super.showInfo();
	  System.out.println("Your Checking Account Details"+
	  "\n Debit Card Number: "+debitNum+
	  "\n Debit Card Pin: "+debitPin);
  }
}
