package org.bank.aman.entities;

public class RegularCustomer implements Customer {
private String customerName;
private String username;
private String password;
private final int customerId;
private double balance;

public RegularCustomer(int customerId){
	this.customerId=customerId;
}

	@Override
	 public String customerName() {
		// TODO Auto-generated method stub
		return customerName;
	}

	@Override
	public String username() {
		// TODO Auto-generated method stub
		return username;
	}

	@Override
	public String password() {
		// TODO Auto-generated method stub
		return password;
	}

	@Override
	public double accountBalance() {
		// TODO Auto-generated method stub
		return balance;
	}

	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return customerId;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
