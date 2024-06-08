package com.sun;

public class BankAccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount bankAccount = new BankAccount();
		bankAccount.setAccountNumber(12345678);
		bankAccount.setAccountHolder("yamada");
		bankAccount.setDeposit( 5000);
		bankAccount.setWithdraw(4000);
		System.out.println(
				"accountNumber:" + bankAccount.getAccountNumber() + "accountHolder:" + bankAccount.getAccountHolder());

	}
}
