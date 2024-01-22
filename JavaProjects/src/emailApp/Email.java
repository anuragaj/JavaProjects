package emailApp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String department;
	int mailboxCapacity;
	private String alternamteEmail;
	private String password;
	
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		setDepartment();
	}
	
	private String setDepartment() {
		System.out.println("Enter Department.\n1.Sales\n2.Development\n3.Accounting\n4.Others\n");
		Scanner in = new Scanner(System.in);
		int choice = in.nextInt();
		switch(choice) {
		case 1: return "Sales";
		case 2: return "Development";
		case 3: return "Accounting";
		default: return "";
		}
	}

}
