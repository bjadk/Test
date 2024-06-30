package com.sun;

public class ToDoListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ToDoListManager manager = new ToDoListManager( );
		manager.addTask("買い物に行く");
		manager.addTask("部屋の掃除");
		manager.completeTask("買い物に行く");
		manager.printTask();
		if(manager.checkTask("買い物に行く")) {
			System.out.println("買い物に行くはリストに存在します ");
		}else {
			System.out.println("買い物に行くはリストに存在しません ");
		}

	}

}
