package com.sun;

/**
 * 「支払い方法」の抽象クラスと、インターフェース「オンライン認証可能」を作成します。
 * 抽象クラス「支払い方法」には、支払い方法の名称（例えば、クレジットカード、電子マネー）を格納する属性と、支払い処理を行う抽象メソッドを含めてください。
 * インターフェース「オンライン認証可能」には、オンライン認証を行うメソッドを定義します。派生クラス「クレジットカード」、
 * 「電子マネー」を作成し、これらのクラスで「支払い方法」の抽象メソッドを実装し、「オンライン認証可能」インターフェースのメソッドをオーバーライドしてください。
 * 
 * 
 */

public abstract class PaymentMethod {
	String mentMethodName;

	abstract void proceMent();
}

interface OnlineAuthenticatable {
	void authenticateOnline();
}

class CreditCard extends PaymentMethod implements OnlineAuthenticatable {

	@Override
	void proceMent() {
		
		// TODO Auto-generated method stub
		System.out.println("支払い方法: "+mentMethodName);
		authenticateOnline();
	}

	@Override
	public void authenticateOnline() {
		// TODO Auto-generated method stub
		System.out.println("online sucess");
	}
}

class ElectronicMOney extends PaymentMethod implements OnlineAuthenticatable {

	@Override
	public void authenticateOnline() {
		// TODO Auto-generated method stub
		System.out.println();

	}

	@Override
	void proceMent() {
		// TODO Auto-generated method stub
		System.out.println();
	}

}
						