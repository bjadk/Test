package com.sun;

/**
 * 「Employee」という基底クラスを作成し、
 * その派生クラスとして「Manager」を作成します。「Employee」クラスには「name（名前）」と「salary（給料）」のフィールドがあり、
 * 「Manager」クラスには「department（部門）」のフィールドが追加されます。それぞれのクラスに適切なコンストラクタとメソッドを実装し、継承の概念を示してください。
 * 
 * 
 * 
 * 
 */
public class Employee {
	String name;
	double salary;

	public void setName(String name) {
		this.name = name;
	}

	public void showName() {
		System.out.println("name: " + name);
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void showSalary() {
		System.out.println("salary: " + salary);
	}

	void display() {
		System.out.println("名前: " + name + ", 給料: " + salary);
	}
}

class Manager extends Employee {
	String department;

	public void setDepartment(String department) {
		this.department = department;
	}

	public void showDepartment() {
		System.out.println("department: " + department);
	}
	void display() {
		System.out.println("名前: " + name + ", 給料: " + salary + "部門: " + department);
	}

}
