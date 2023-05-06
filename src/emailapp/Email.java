package emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String department;
	private String password;
	private String emailID;
	private int maxEmailCount = 500;
	private int defaultPasswordLength = 8;
	private String alternateEmail;
	private String companysuffix = "gmail.com";
	
	Scanner sc = new Scanner(System.in);
	public Email() {
		System.out.println("Enter your FirstName & LastName");
		//Asking for Fname and Lname
		this.firstName = sc.next();
		this.lastName = sc.next();
		Email(firstName,lastName);
	}
	private void Email(String firstName,String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("EMAIL CREATED: "+this.firstName+" "+this.lastName);
		
		//Call a method asking for department and returning the department
		this.department = setDepartment();
		System.out.println("Department: "+this.department);
			
		//Generate Email ex: firstName.lastName@department.company.com
		this.emailID = this.firstName.toLowerCase()+"."+this.lastName.toLowerCase()+"@"+this.department.toLowerCase()+"."+this.companysuffix;
		System.out.println("Your Email ID: "+this.emailID);
		
		//Call a method to generate random password and returning it
		this.password = setRandomPassword(defaultPasswordLength);
		System.out.println("Your Password is: "+this.password);
	}
	
	//Ask for department
	private String setDepartment() {
		System.out.println("Department Codes\n0 None\n1 Sales\n2 Development\n3 Accounting\nEnter Department Code: ");
		int deptChoice = sc.nextInt();
		if(deptChoice == 1) {return "Sales";}
		else if (deptChoice == 2) {return "Development";}
		else if(deptChoice == 3) {return "Accounting";}
		else {return "";}
	}
	
	//Generating random password
	private String setRandomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXY123456789!@#$%^&*";
		char[] password = new char[length];
		for(int i=0;i<length;i++) {
			int randomP = (int)(Math.random() * passwordSet.length());  
			password[i] = passwordSet.charAt(randomP);
		}
		return new String(password);
		
	}
	
	//Set max email count
	public int getMaxEmailCount() {
		return maxEmailCount;
	}
	public void setMaxEmailCount(int maxEmailCount) {
		this.maxEmailCount = maxEmailCount;
	}
	
	//Set alternate Email
	public String getAlternateEmail() {
		return alternateEmail;
	}
	public void setAlternateEmail(String alternateEmail) {
		this.alternateEmail = alternateEmail;
	}
	
	//change password
	public String getPassword() {
		return password;
	}
	public void changePassword(String password) {
		this.password = password;
	}
	
	//Show the info
	public void showInfo() {
		System.out.println("\n--------------------------------------------\nDetails \n--------------------------------------------");
		System.out.println("DISPLAY NAME: "+firstName+" "+lastName+"\nCOMPANY EMAIL: "+emailID+"\nMAILBOX CAPACITY: "+maxEmailCount+"mb");
	}
}
