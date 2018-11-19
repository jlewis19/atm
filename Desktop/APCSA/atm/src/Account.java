import java.util.concurrent.ThreadLocalRandom;

public class Account {
	private double balance;
	private int accountNum;
	private User user;
	
	public Account(double balance, int accountNum, User user) {
		this.balance = balance;
		this.accountNum = accountNum;
		this.user = user;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public int getAccountNum() {
		return this.accountNum;
	}
	
	public User getUser() {
		return this.user;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public int randomAccountNum() {
		int randomNum = ThreadLocalRandom.current().nextInt(100000000, 1000000000);
		return randomNum;
	}
}