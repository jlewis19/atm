import java.util.Scanner;

public class Tester {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		User jl = new User("Justin Lewis", 1234, 555555555, "123 Address Lane", 1234567890);
		Account account = new Account(500, 123456789, jl);
		ATM atm = new ATM(account);
		
		int decision = 0;
		
		System.out.println("Welcome to the JustinLewisCo ATM Machine.");
		while (decision != 1 && decision != 2) {
			System.out.print("\n\t[1] Log In\n\t[2] Create Account\n\nMake a selection: ");
			decision = in.nextInt();
		}
		
		if (decision == 1) {
			System.out.println("\nPlease insert your account and PIN numbers.\n");
			
			while(!atm.login()) {
				System.out.println("\nInvalid account number and/or PIN.\n");
			}
			
			while(atm.welcome()) {
				System.out.print("");
			}
		} else {
			System.out.print("\nEnter your first and last name: ");
			String name = in.nextLine();
			in.nextLine();
			System.out.print("\nEnter your phone number: ");
			long phoneNum = in.nextLong();
			System.out.print("\nEnter your current address: ");
			String address = in.nextLine();
			in.nextLine();
			System.out.print("\nEnter your Social Security number: ");
			long ssn = in.nextLong();
			in.nextLine();
			while (ssn < 100000000 || ssn > 999999999) {
				System.out.print("\nYour Social Security number must have 9 digits.\n\nEnter your Social Security number: ");
				ssn = in.nextInt();
				in.nextLine();
			}
			int accountNum = account.randomAccountNum();
			System.out.println("\nYour new account number is " + accountNum + ".");
			int checkPin = 0;
			int pin = 1;
			while (pin != checkPin) {
				if (pin != 1) {
					System.out.println("\nThe PIN numbers did not match.");
				}
				System.out.print("\nEnter a 4 digit PIN number: ");
				pin = in.nextInt();
				in.nextLine();
				while (pin < 1000 || pin > 9999) {
					System.out.print("\nYour PIN number must have 4 digits.\nEnter a 4 digit PIN number: ");
					pin = in.nextInt();
					in.nextLine();
				}
				System.out.print("\nConfirm your PIN number: ");
				checkPin = in.nextInt();
				in.nextLine();
			}
			
			User newUser = new User(name, pin, ssn, address, phoneNum);
			Account newAccount = new Account(0, accountNum, newUser);
			ATM newAtm = new ATM(newAccount);
			
			System.out.println("\nPlease insert your account and PIN numbers.\n");
			
			while(!newAtm.login()) {
				System.out.println("\nInvalid account number and/or PIN.\n");
			}
			
			while(newAtm.welcome()) {
				System.out.print("");
			}
		}
		
		in.close();
	}
}