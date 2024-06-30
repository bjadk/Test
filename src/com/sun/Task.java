package com.sun;

/**
 * Queueインターフェースを使って、簡易的なタスクスケジューラをシミュレートするプログラムを作成してください。以下の要件に従ってください。
 * 
 * Taskクラスを作成します。このクラスには、タスクの名前を表すnameというString型のフィールド、そしてタスクの所要時間を表すdurationというint型のフィールドがあります。
 * Queue<Task>のインスタンスを作成し、複数のTaskオブジェクトを追加します。
 * キューからタスクを一つずつ取り出し、"タスク[タスク名]を実行中... 完了予定時間: [所要時間]分"と表示します。
 * キューが空になるまで、3の操作を繰り返します。
 * 
 * 
 */
public class Task {
	String name;
	int duration;

	Task(String name, int duration) {
		this.duration = duration;
		this.name = name;
	}

}
	