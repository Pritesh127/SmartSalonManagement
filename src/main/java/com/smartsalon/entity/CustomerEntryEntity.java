package com.smartsalon.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class CustomerEntryEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	public int entryId;
	
	private String entryCustomerName;
	private String entryEmployeeName;
	private String entryServiceName;
	private String entryPaymentMode;
	private String entryTimeDate;
	private String entryDiscount;
	private String entryTotalPrice;
	private String entryTotalPayablePrice;
	public CustomerEntryEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CustomerEntryEntity(String entryCustomerName, String entryEmployeeName, String entryServiceName,
			String entryPaymentMode, String entryTimeDate, String entryDiscount, String entryTotalPrice,
			String entryTotalPayablePrice) {
		super();
		this.entryCustomerName = entryCustomerName;
		this.entryEmployeeName = entryEmployeeName;
		this.entryServiceName = entryServiceName;
		this.entryPaymentMode = entryPaymentMode;
		this.entryTimeDate = entryTimeDate;
		this.entryDiscount = entryDiscount;
		this.entryTotalPrice = entryTotalPrice;
		this.entryTotalPayablePrice = entryTotalPayablePrice;
	}
	public int getEntryId() {
		return entryId;
	}
	public void setEntryId(int entryId) {
		this.entryId = entryId;
	}
	public String getEntryCustomerName() {
		return entryCustomerName;
	}
	public void setEntryCustomerName(String entryCustomerName) {
		this.entryCustomerName = entryCustomerName;
	}
	public String getEntryEmployeeName() {
		return entryEmployeeName;
	}
	public void setEntryEmployeeName(String entryEmployeeName) {
		this.entryEmployeeName = entryEmployeeName;
	}
	public String getEntryServiceName() {
		return entryServiceName;
	}
	public void setEntryServiceName(String entryServiceName) {
		this.entryServiceName = entryServiceName;
	}
	public String getEntryPaymentMode() {
		return entryPaymentMode;
	}
	public void setEntryPaymentMode(String entryPaymentMode) {
		this.entryPaymentMode = entryPaymentMode;
	}
	public String getEntryTimeDate() {
		return entryTimeDate;
	}
	public void setEntryTimeDate(String entryTimeDate) {
		this.entryTimeDate = entryTimeDate;
	}
	public String getEntryDiscount() {
		return entryDiscount;
	}
	public void setEntryDiscount(String entryDiscount) {
		this.entryDiscount = entryDiscount;
	}
	public String getEntryTotalPrice() {
		return entryTotalPrice;
	}
	public void setEntryTotalPrice(String entryTotalPrice) {
		this.entryTotalPrice = entryTotalPrice;
	}
	public String getEntryTotalPayablePrice() {
		return entryTotalPayablePrice;
	}
	public void setEntryTotalPayablePrice(String entryTotalPayablePrice) {
		this.entryTotalPayablePrice = entryTotalPayablePrice;
	}
	@Override
	public String toString() {
		return "CustomerEntryEntity [entryId=" + entryId + ", entryCustomerName=" + entryCustomerName
				+ ", entryEmployeeName=" + entryEmployeeName + ", entryServiceName=" + entryServiceName
				+ ", entryPaymentMode=" + entryPaymentMode + ", entryTimeDate=" + entryTimeDate + ", entryDiscount="
				+ entryDiscount + ", entryTotalPrice=" + entryTotalPrice + ", entryTotalPayablePrice="
				+ entryTotalPayablePrice + "]";
	}
	
}
