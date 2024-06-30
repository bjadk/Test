package com.sun;

import java.util.ArrayList;
import java.util.List;

/**
 * 「ToDoリスト管理」クラスを作成し、個人の日常のタスクやToDo項目をリストで管理する機能を含めてください。
 * このクラスには、新しいタスクの追加、特定のタスクの完了（リストからの削除）、
 * および全タスクの表示をするメソッドを含めてください。また、特定のタスクがリスト内に存在するかどうかを確認するメソッドも追加してください。
 *
 */
public class ToDoListManager {
	private List<String> toDoList = new ArrayList<>();

	public void addTask(String task) {
		toDoList.add(task);

	}

	public void completeTask(String task) {
		toDoList.remove(task);

	}

	public void printTask() {
		System.out.println("toDoリスト:");
		for (String task : toDoList) {
			System.out.println("-" + task);
		}
	}

	public boolean checkTask(String task) {
		return toDoList.contains(task);

	}
}
