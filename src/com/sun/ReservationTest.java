package com.sun;

public class ReservationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HotelReservationManager hotelReservationManager = new HotelReservationManager();
		hotelReservationManager.addReservation("田中一郎", "2023/07/15");
		hotelReservationManager.cancelaReservation("田中一郎", "2023/07/15");
		hotelReservationManager.prinReservation();
		if (hotelReservationManager.checkReservation("2023/07/15")) {
			System.out.println("2023/07/15の予約はあります。");
		} else {
			System.out.println("2023/07/15の予約はありません。");
		}
	}

}
