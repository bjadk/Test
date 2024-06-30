package com.sun;

import java.util.LinkedList;
import java.util.Queue;

public class Custormer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = { "田中", "佐藤", "鈴木", "高橋" };
		Queue<Customer> queue = new LinkedList<>();
		for (String name : names) {
			queue.add(new Customer(name));

		}
		while (!queue.isEmpty()) {
            Customer customer = queue.remove();
            System.out.println(customer.name + "さん、窓口にどうぞ。");

	}

}
}
