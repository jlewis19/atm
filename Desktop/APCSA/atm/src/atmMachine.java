public class atmMachine {
	public static void main(String[] args) {
		User jl = new User("Justin Lewis", 1234, 555-55-5555, "123 Address Lane", 1234567890);
		Account account = new Account(500, 123456789, jl);
		ATM atm = new ATM(account);
		
		System.out.println("Welcome to the JustinLewisCo ATM Machine.\nTo begin, please insert your account and PIN numbers.\n");
		
		while(!atm.login()) {
			System.out.println("\nInvalid account number and/or PIN.\n");
		}
		
		while(atm.welcome()) {
			System.out.print("");
		}
	}
}