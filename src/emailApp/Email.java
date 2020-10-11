package emailApp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String department;
	private String password;
	private String email;
	private int defaultPasswordLength=8;
	private int emailBoxCapacity;
	private String alternateEmail;

	// constructor for firstName and lastName
	public Email(String firstName, String lastName) {
		// super();
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("\nEmail for " + this.firstName + " " + this.lastName + " " + "is created.\n");
		
		// call the method for setting department name
		this.department=setDepartment();
		System.out.println("\n"+this.firstName+" "+this.lastName+" "+"selected "+this.department +" department");
		
		//call method for setting a random password
		this.password=setPassword(defaultPasswordLength);
		System.out.println("\nThe Email Password is set as:" + this.password+"\n");
		
		//call method to set the email syntax as fname.lname@dept.company.com
		System.out.println(this.email=this.firstName.toLowerCase()+"."+this.lastName.toLowerCase()+"@"+this.department.toLowerCase()+"."+"ucmo.com");
	}

	// set the alternate Email
	public void setAlternateEmail(String email)
	{
		this.alternateEmail=email;
	}
	//set password capacity
	public void setEmailBoxCapacity(int capacity)
	{
		this.emailBoxCapacity=capacity;
	}
	// get the department
	private String setDepartment() {
		System.out.print("Department Codes are:\n \n1 SALES\n2 ACCOUNTING\n3 DEVELOPING\n0 NONE\n\nPlease enter your Departement Code:");
		Scanner s= new Scanner(System.in);
		int deptID=s.nextInt();
		if(deptID==1) {return "SALES";}
		else if(deptID==2) {return "ACCOUNTING";}
		else if(deptID==3) {return "DEVELOPING";}
		else {return " ";}

	}

	// set the random password
	private String setPassword(int length)
	{
		String pass = "ABCDEFGHIJKLMNOPQRSTUVZ0123456789!@#$%&";
		char[] password =new char[length];
		for(int i=0;i<length;i++)
		{
			int rand=(int)(Math.random()*pass.length());
			password[i]=pass.charAt(rand);
		
		}
		return new String(password); 
	}

	// change the password
	public void setChangePassword(String password)
	{
		this.password=password;
	}
	public String getAlternateEmail(){return alternateEmail;}
	public String getChangedPassword() {return password;}
	public int getEmailBoxCapacity() {return emailBoxCapacity;}
	
	//Show the info of name, capacity and email
	public String showInfo()
	{
		return this.firstName + this.lastName + "with the email capacity of "+this.emailBoxCapacity +" MB with the syntax "+this.email;
	}

}
