package com.sun;

/**
 * 銀行口座（BankAccount）クラスを設計してください。このクラスには、口座番号（accountNumber）、口座名義人（accountHolder）、
 * 口座残高（balance）という3つのプライベート属性が必要です。カプセル化の原則に従い、
 * これらの属性に安全にアクセスするための公開メソッド（ゲッターとセッター）を実装し、さらに預金（deposit）と引き出し（withdraw）の機能も追加してください。
 * 引き出しメソッドでは、残高が引き出し額より少ない場合は引き出しを拒否するようにしてください。
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
public class BankAccount {
	private String accountNumber;
	private String accountHolder;
	private int balance;

	public BankAccount(String accountNumber, String accountHolder, int balance) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.balance = balance;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public int getBalance() {
		return balance;

	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public void deposit(int amount) {
		if (amount > 0) {
			balance += amount;
		}
	}

	public void Withdraw(int amount) {

		if (amount <= balance && amount > 0) {
			balance -= amount;
		} else {
			System.out.println(" お金足りない");
		}

	}

	public static void displayAccountDetails(BankAccounts account1) {
		// TODO Auto-generated method stub

	}

	public static void displayAccountDetails(BankAccount account1) {
		// TODO Auto-generated method stub

	}
}
