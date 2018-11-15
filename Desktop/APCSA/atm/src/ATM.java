import java.util.Scanner;

public class ATM {
	Scanner in = new Scanner(System.in);
	
	private Account account;
	
	public ATM(Account account) {
		this.account = account;
	}
	
	public Account getAccount() {
		return this.account;
	}
	
	public boolean login() {
		System.out.print("Account # : ");
		int accountInput = in.nextInt();
		System.out.print("    PIN # : ");
		int pinInput = in.nextInt();
		if (pinInput == this.account.getUser().getPin() && accountInput == this.account.getAccountNum()) {
			System.out.println("\nWelcome, " + account.getUser().getName() + "! What can I help you with?\n");
			return true;
		} else {
			return false;
		}
	}
	
	public boolean welcome() {
		boolean run = true;
		System.out.print("\t[1] Deposit\n\t[2] Withdraw\n\t[3] View Balance\n\t[4] Exit\n\nMake a selection: ");
		int decision = in.nextInt();
		System.out.println("");
		switch (decision) {
			case 1: 
				deposit();
				break;
			case 2:
				withdraw();
				break;
			case 3:
				System.out.printf("The current balance is $%.2f.\n\n", this.account.getBalance());
				break;
			case 4: 
				System.out.println("Goodbye!");
				run = false;
				break;
		}
		return run;
	}
	
	public void withdraw() {
		System.out.print("Enter amount: ");
		double withdrawal = in.nextDouble();
		while (withdrawal < 0) {
			System.out.print("\nYou cannot withdraw a negative amount.\n\nEnter amount: ");
			withdrawal = in.nextDouble();
		}
		while (withdrawal > this.account.getBalance()) {
			System.out.print("\nYou cannot withdraw more than your current balance.\n\nEnter amount: ");
			withdrawal = in.nextDouble();
		}
		
		this.account.setBalance(this.account.getBalance() - withdrawal);
		System.out.printf("\nWithdrew $%.2f. Updated balance is $%.2f\n\n", withdrawal, this.account.getBalance());
	}
	
	public void deposit() {
		System.out.print("Enter amount: ");
		double deposit = in.nextDouble();
		while (deposit < 0) {
			System.out.print("\nYou cannot deposit a negative amount.\n\nEnter amount: ");
			deposit = in.nextDouble();
		}
		this.account.setBalance(this.account.getBalance() + deposit);
		System.out.printf("\nDeposited $%.2f. Updated balance is $%.2f\n\n", deposit, this.account.getBalance());
	}
}