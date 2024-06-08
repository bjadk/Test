package com.sun;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager manager = new Manager();
		manager.setName("yamada");
		manager.setSalary(500000.45);
		manager.setDepartment("it");
		manager.showDepartment();
		manager.showName();
		manager.showSalary();
	}

}
