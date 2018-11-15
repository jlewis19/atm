public class User {
	private String name;
	private int pin;
	private int ssn;
	private String address;
	private int phoneNum;
	
	public User(String name, int pin, int ssn, String address, int phoneNum) {
		this.name = name;
		this.pin = pin;
		this.ssn = ssn;
		this.address = address;
		this.phoneNum = phoneNum;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getPin() {
		return this.pin;
	}
	
	public int getSsn() {
		return this.ssn;
	}
	
	public String getAddress() {
		return this.address;
	}
	
	public int getPhoneNum() {
		return this.phoneNum;
	}
}