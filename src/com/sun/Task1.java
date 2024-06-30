package com.sun;

import java.util.LinkedList;
import java.util.Queue;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] tasksData = { { "メール確認", "5" }, { "レポート作成", "30" }, { "会議", "15" } };
		Queue<Task> taskQueue = new LinkedList<>();

		for (String[] taskData : tasksData) {
			String name = taskData[0];
			int duration = Integer.parseInt(taskData[1]);
			taskQueue.add(new Task(name, duration));
		}
		while (!taskQueue.isEmpty()) {
			Task task = taskQueue.remove();
			System.out.println("タスク[" + task.name + "]を実行中... 完了予定時間: " + task.duration + "分");
		}

	}
}
