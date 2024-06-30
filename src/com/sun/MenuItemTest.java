package com.sun;

import java.util.ArrayList;
import java.util.List;

public class MenuItemTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OrderManager manager = new OrderManager();
		List<MenuItem> table1Orders = new ArrayList<>();
		table1Orders.add(new MenuItem("寿司", 1200));
		table1Orders.add(new MenuItem("天ぷら", 900));

		manager.addTableOrder(table1Orders);
		List<MenuItem> tables2Orders = new ArrayList<>();
		tables2Orders.add(new MenuItem("刺身", 1500));
		tables2Orders.add(new MenuItem("煮物", 800));
		manager.addTableOrder(tables2Orders);
		manager.printOrders();

	}

}
