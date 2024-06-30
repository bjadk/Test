package com.sun;

public class BankAccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount bankAccount = new BankAccount("12345678", "山田太郎", 10000);

		bankAccount.deposit(5000);
		bankAccount.Withdraw(24000);
		System.out.println("口座残高: " + bankAccount.getBalance() + "円");

	}
}
	