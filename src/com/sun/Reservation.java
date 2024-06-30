package com.sun;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * 「ホテル予約管理」クラスを作成し、ホテルの客室予約を管理する機能を含めてください。
 * このクラスには、客室の予約を追加し、予約をキャンセルし、全ての予約を表示するメソッドを含めてください。予約情報には、
 * 予約者の名前と予約日が含まれます。また、特定の日付の予約が存在するかを確認するメソッドも追加してください。
 * 
 */
public class Reservation {
	String guestName;
	String date;

//	Reservation(String guestName, String name ){
//		this.date = date;
//		this .guestName= guestName;
//	}
//	public boolean equals1(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Reservation that = (Reservation) o;
//        return Objects.equals(guestName, that.guestName) &&
//               Objects.equals(date, that.date);
//		
//	}
//	 @Override
//	    public boolean equals(Object o) {
//	        if (this == o) return true;
//	        if (o == null || getClass() != o.getClass()) return false;
//	        Reservation that = (Reservation) o;
//	        return Objects.equals(guestName, that.guestName) &&
//	               Objects.equals(date, that.date);
//	    }
//
//	    public int hashCode1() {
//	        return Objects.hash(guestName, date);
//	    }
//	}
	Reservation(String guestName, String date) {
		this.guestName = guestName;
		this.date = date;
	}

	public boolean equalas1(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Reservation that = (Reservation) o;
		return Objects.equals(guestName, that.guestName) && Objects.equals(date, that.date);

	}

	public int hasCode() {
		return Objects.hash(guestName, date);
	}

}

class HotelReservationManager {
	private List<Reservation> reservation = new ArrayList<>();

	public void addReservation(String name, String date) {
		reservation.add(new Reservation(name, date));

	}

	public void cancelaReservation(String name, String date) {
		reservation.remove(new Reservation(name, date));
	}

	public void prinReservation() {
		for (Reservation reservation : reservation) {
			System.out.println("予約者: " + reservation.guestName + ", 日付" + reservation.date);
		}
	}

	public boolean checkReservation(String string) {
		// TODO Auto-generated method stub
		return false;
	}
}

//class HotelReservationManager {
//	private List<Reservation> reservations = new ArrayList<>();
//
//	/**
//	 * 予約を追加するメソッド。
//	 *
//	 * @param name 予約者の名前
//	 * @param date 予約日
//	 */
//	public void addReservation(String name, String date) {
//		reservations.add(new Reservation(name, date));
//	}
//
//	/**
//	 * 予約をキャンセルするメソッド。
//	 *
//	 * @param name 予約者の名前
//	 * @param date 予約日
//	 */
//	public void cancelReservation(String name, String date) {
//		reservations.remove(new Reservation(name, date));
//	}
//
//	/**
//	 * 全ての予約を表示するメソッド。
//	 */
//	public void printReservations() {
//		for (Reservation reservation : reservations) {
//			System.out.println("予約者: " + reservation.guestName + ", 日付: " + reservation.date);
//		}
//	}
//
//	/**
//	 * 特定の日付の予約が存在するかをチェックするメソッド。
//	 *
//	 * @param date 確認する予約日
//	 */
//	public boolean checkReservation(String date) {
//		return reservations.stream().anyMatch(reservation -> reservation.date.equals(date));
//	}
//}
