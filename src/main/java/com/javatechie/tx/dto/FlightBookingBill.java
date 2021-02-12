package com.javatechie.tx.dto;

import com.javatechie.tx.entity.PassengerInfo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlightBookingBill {
	
	private String status;
	private double totalFare;
	private String pnrNo;
	private PassengerInfo passengerInfo;
	
	public FlightBookingBill(String status, double totalFare, String pnrNo, PassengerInfo passengerInfo) {
		this.setStatus(status);
		this.setTotalFare(totalFare);
		this.setPnrNo(pnrNo);
		this.setPassengerInfo(passengerInfo);
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public double getTotalFare() {
		return totalFare;
	}

	public void setTotalFare(double totalFare) {
		this.totalFare = totalFare;
	}

	public String getPnrNo() {
		return pnrNo;
	}

	public void setPnrNo(String pnrNo) {
		this.pnrNo = pnrNo;
	}

	public PassengerInfo getPassengerInfo() {
		return passengerInfo;
	}

	public void setPassengerInfo(PassengerInfo passengerInfo) {
		this.passengerInfo = passengerInfo;
	}

}
