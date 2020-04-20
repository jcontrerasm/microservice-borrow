package com.jcontrerasm.borrow.model.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name = "borrow_scheduler")
public class Borrow implements Serializable {

	private static final long serialVersionUID = 2186397031788557776L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_borrow")
	private int borrowId;
	@Column(name = "nro_borrow")
	private int nroBorrow;
	private int fee;
	@Column(name = "expiration_date")
	private String expirationDate;
	private int days;
	private double stock;
	private double interest;
	@Column(name = "fee_amount")
	private double feeAmount;
	private boolean paid;
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_customer", insertable= false, updatable = false)
	@Fetch(FetchMode.JOIN)
	private Customer customer;
	
	public int getBorrowId() {
		return borrowId;
	}
	
	public void setBorrowId(int borrowId) {
		this.borrowId = borrowId;
	}
	
	public int getNroBorrow() {
		return nroBorrow;
	}
	
	public void setNroBorrow(int nroBorrow) {
		this.nroBorrow = nroBorrow;
	}
	
	public int getFee() {
		return fee;
	}
	
	public void setFee(int fee) {
		this.fee = fee;
	}
	
	public String getExpirationDate() {
		return expirationDate;
	}
	
	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}
	
	public int getDays() {
		return days;
	}
	
	public void setDays(int days) {
		this.days = days;
	}
	
	public double getStock() {
		return stock;
	}
	
	public void setStock(double stock) {
		this.stock = stock;
	}
	
	public double getInterest() {
		return interest;
	}
	
	public void setInterest(double interest) {
		this.interest = interest;
	}
	
	public double getFeeAmount() {
		return feeAmount;
	}
	
	public void setFeeAmount(double feeAmount) {
		this.feeAmount = feeAmount;
	}
	
	public boolean isPaid() {
		return paid;
	}
	
	public void setPaid(boolean paid) {
		this.paid = paid;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
}
