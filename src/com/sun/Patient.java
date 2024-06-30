package com.sun;

import java.util.ArrayList;
import java.util.List;

/**
 * 「患者管理」クラスを作成し、病院の患者情報をリストで管理する機能を含めてください。このクラスには、患者の名前と診察日をペアでリストに追加するメソッド
 * 、特定の患者の情報を検索するメソッド、 および診察日に基づいてリストをソートするメソッドを含めてください。診察日は日付で表され、古い順にソートします。
 */
public class Patient {
	String name;
	String appointmentDate;

	Patient(String name, String appointmentDate) {
		this.name = name;
		this.appointmentDate = appointmentDate;
	}

	@Override
	public  String  toString () {
		return name+":"+appointmentDate;
	}

}
