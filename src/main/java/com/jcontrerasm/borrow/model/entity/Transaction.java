package com.jcontrerasm.borrow.model.entity;

import java.io.Serializable;

public class Transaction implements Serializable {

	private static final long serialVersionUID = 1398710129544054057L;
	
	private int id;
	private int nroBorrow;
	private double feeAmount;
	private int fee;
	private String creationDate;
	private int borrowId;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNroBorrow() {
		return nroBorrow;
	}
	public void setNroBorrow(int nroBorrow) {
		this.nroBorrow = nroBorrow;
	}
	public double getFeeAmount() {
		return feeAmount;
	}
	public void setFeeAmount(double feeAmount) {
		this.feeAmount = feeAmount;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	public String getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}
	public int getBorrowId() {
		return borrowId;
	}
	public void setBorrowId(int borrowId) {
		this.borrowId = borrowId;
	}
}
