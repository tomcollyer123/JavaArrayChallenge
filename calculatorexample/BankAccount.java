package com.qa.calculatorexample;

public class BankAccount {
	
//	Add a few attributes
	
	private int balance;
	private String bankName;
	private int accountNumber;
	
//	Generate getters and setters
	
	public int getbalance() {
		return this.balance;
		
	}
	
	public void setBalance(int newBalance) {
		this.balance = newBalance; 
	}
		
	public String getbankname() {
		return this.bankName;
	}
	
	public void setbankname(String newBankName) {
		this.bankName = newBankName; 
	}
	
	public int getaccountnumber() {
		return this.accountNumber;
		
	}
	
	public void setaccountNumber(int newAccountNumber) {
		this.accountNumber = newAccountNumber;
}
//	Generate constructor with all attributes
	
	public BankAccount(int balance, String bankName, int accountNumber) {
		this.balance = balance;
		this.bankName = bankName;
		this.accountNumber = accountNumber;
	}
}
