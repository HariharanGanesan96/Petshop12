package Class;

import java.util.Date;

public class AnimalsCustomers {

	private int customerId;
	private String firstName;
	private String lastName;
	private String userName;
	private String password;
	private String email;
	private long number;
	private long bank;
	private String role;
	private Date regDate;

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	public long getBank() {
		return bank;
	}

	public void setBank(long bank) {
		this.bank = bank;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public AnimalsCustomers() {
		super();
		// TODO Auto-generated constructor stub
	}
    
	
	public AnimalsCustomers(int customerId) {
		super();
		this.customerId = customerId;
	}

	public AnimalsCustomers(int customerId, long bank) {
		super();
		this.customerId = customerId;
		this.bank = bank;
	}

	public AnimalsCustomers(int customerId, String firstName, String lastName, String userName, String password,
			String email, long number, long bank, String role) {
		super();
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.number = number;
		this.bank = bank;
		this.role = role;
	}

	@Override
	public String toString() {
		return "AnimalsCustomers [customerId=" + customerId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", userName=" + userName + ", password=" + password + ", email=" + email + ", number=" + number
				+ ", bank=" + bank + ", role=" + role + ", regDate=" + regDate + "]";
	}

	public AnimalsCustomers(int customerId, String firstName, String lastName, String userName, String password,
			String email, long number, long bank, String role, Date regDate) {
		super();
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.number = number;
		this.bank = bank;
		this.role = role;
		this.regDate = regDate;
	}

}
