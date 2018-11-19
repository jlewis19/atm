public class User {
	private String name;
	private int pin;
	private long ssn;
	private String address;
	private long phoneNum;
	
	public User(String name, int pin, long ssn, String address, long phoneNum) {
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
	
	public long getSsn() {
		return this.ssn;
	}
	
	public String getAddress() {
		return this.address;
	}
	
	public long getPhoneNum() {
		return this.phoneNum;
	}
}