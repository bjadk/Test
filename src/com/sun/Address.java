package com.sun;

public class Address {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fullAddress = "渋谷区, 明治通り, 1-2-3";
		String[] addresspart = fullAddress.split(",");
		System.out.println("市区町村：" + addresspart[0]);
		System.out.println("通り：" + addresspart[1]);
		System.out.println("番地：" + addresspart[2]);
	}

}
	