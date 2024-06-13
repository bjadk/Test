package com.sun;

public class PaymentMethodTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreditCard creditcard = new CreditCard();
		creditcard.mentMethodName = "クレジットカード";
		ElectronicMOney electronicMOney = new ElectronicMOney();
		electronicMOney.mentMethodName = "電子マネー";
		creditcard.authenticateOnline();
		electronicMOney.authenticateOnline();
	}

}
