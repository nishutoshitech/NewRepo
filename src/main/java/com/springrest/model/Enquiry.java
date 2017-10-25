package com.springrest.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Enquiry {
	@Id
	private int enquiryId;
	@Column
	private String enquiryString;
	@Column
	private Date enquiryDate;

	public Enquiry() {
	}

	public Enquiry(int enquiryId, String enquiryString) {
		super();
		this.enquiryId = enquiryId;
		this.enquiryString = enquiryString;
		this.enquiryDate = new Date();
	}

	public Date getEnquiryDate() {
		return enquiryDate;
	}

	public void setEnquiryDate(Date enquiryDate) {
		this.enquiryDate = enquiryDate;
	}

	public int getEnquiryId() {
		return enquiryId;
	}

	public void setEnquiryId(int enquiryId) {
		this.enquiryId = enquiryId;
	}

	public String getEnquiryString() {
		return enquiryString;
	}

	public void setEnquiryString(String enquiryString) {
		this.enquiryString = enquiryString;
	}

}
