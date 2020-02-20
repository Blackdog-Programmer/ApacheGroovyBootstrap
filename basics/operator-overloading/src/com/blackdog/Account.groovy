package com.blackdog

@groovy.transform.ToString
class Account {
	BigDecimal balance
	String type
	
	Account(newType) {
		type = newType
		balance = 0.0
	}
	
	void deposit(ammount) {
		balance += ammount
	}
	
	void withdraw(ammount) {
		balance -= ammount
	}
	
	// +Operator Overloading
	BigDecimal plus(Account otherAccount) {
		return this.balance + otherAccount.balance;
	} 
}
