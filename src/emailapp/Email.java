package emailapp;

import java.util.*;


public class Email {
	
	private String firstName;
	private String lastName;
	private String password;
	private String email;
	private String department;
	private int mailboxCapacity =500;
	private String alternateEmail;
	private int defaultPasswordLength = 10 ;
	//private int mailboxCapacity; 
	
	
	public Email(String firstName, String lastName)  //constructor to receive first name and last name
	{ 
		this.firstName = firstName;
		this.lastName = lastName;
	//System.out.println("EMAIL CREATED ->"+ this.firstName+" "+ this.lastName);
	       
	      // call method to ask department
	      this.department=askDepartment();
	  	//System.out.println("Department: "+ this.department);
 
	  	  // call method to generate random password
	  	  this.password=randomPassword(defaultPasswordLength);
	   	System.out.println("Your Password is: "+password);
	
	  email=firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department.toLowerCase()+".company.com";  
	  // System.out.println("Your email is: "+email);	
	}
	
	private String askDepartment() // ask department
	{
		System.out.println("Enter the department\n1 for Technology\n2 for Research & Development\n3 for HR\n0 for none ");
		Scanner sc=new Scanner (System.in);
		int ep_dept=sc.nextInt();
		
		if(ep_dept==1)
			return "Technology";
		
		else if(ep_dept==2)
			return "Research & Development";
		
		else if(ep_dept==3)
			return "HR";
		
		else 
			return "";
		
	}
	
	private String randomPassword(int length) // generate random password
	{
		String passwordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyx0123456789!@#$%";
		char[] password =new char[length];
		
		for(int i=0;i<length;i++)
		{
		 int rand= (int)(Math.random() * passwordSet.length());
		 password[i]=passwordSet.charAt(rand);
		}
		
		return new String(password);
		
	}
	
	public void setMailBoxCapacity(int capacity)
	{
		this.mailboxCapacity=capacity;
	}
	
	public void setAlternateEmail(String altEmail)
	{
		this.alternateEmail=altEmail;
	}
	
	public int getMailboxCapacity()
	{
		return mailboxCapacity;
	}
	
	public String getAlternateEmail()
	{
		return alternateEmail;
	}
	
	public String getPassword()
	{
		return password;
	}
	
	public String showInfo() 
	{
		return "NAME: "+firstName+" "+lastName +
				"\nEMAIL: "+email+
				"\nMAILBOX CAPACITY: "+ mailboxCapacity +"mb";
	}

}
