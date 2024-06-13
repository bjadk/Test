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
	private long accountNumber;
	private String accountHolder;
	private int balance;
	private int deposit;
	private int withdraw;

	public long getAccountNumber() {
		return accountNumber;
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public int getBalance() {
		return balance;

	} 

	public int getDeposit() {
		return deposit;
	}

	public int getWithdraw() {
		return withdraw;
	}
	public void setDeposit( int deposit) {
		this.deposit = deposit;
	}
	public int setWithDraw(int withdraw ) {
		return this.withdraw = withdraw;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public void setWithdraw(int amount) {

		if (amount >= balance && amount > 0) {
			balance -= withdraw;
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
