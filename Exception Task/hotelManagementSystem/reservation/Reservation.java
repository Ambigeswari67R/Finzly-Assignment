package hotelManagementSystem.reservation;

import java.util.HashMap;
import java.util.Map;

import hotelManagementSystem.Guest;
public  class Reservation {
	private int roomNo;
	private Guest guest;
	private String startDate;
	private String endDate;
	
	
	public Reservation(int roomNo, Guest guest, String startDate, String endDate) {
		super();
		this.roomNo = roomNo;
		this.guest = guest;
		this.startDate = startDate;
		this.endDate = endDate;
		
	}
	
	public int getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}
	public Guest getGuest() {
		return guest;
	}
	public void setGuest(Guest guest) {
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	//public abstract void makeReservation(int roomNo, Guest guest, String startDate, String endDate);
}