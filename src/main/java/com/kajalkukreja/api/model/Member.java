package com.kajalkukreja.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "member")
public class Member {

	@Id
    @GeneratedValue
    private Long id;
	
	private String email;
	
	private String mobileNo;
	
	private int pincode;
	
	private int districtId;

	public Member() { }
	
	public Member(String email, String mobileNo, int pincode, int districtId) {
		super();
		this.email = email;
		this.mobileNo = mobileNo;
		this.pincode = pincode;
		this.districtId = districtId;
	}

	public Member(Long id, String email, String mobileNo, int pincode, int districtId) {
		super();
		this.id = id;
		this.email = email;
		this.mobileNo = mobileNo;
		this.pincode = pincode;
		this.districtId = districtId;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public int getDistrictId() {
		return districtId;
	}

	public void setDistrictId(int districtId) {
		this.districtId = districtId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + districtId;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((mobileNo == null) ? 0 : mobileNo.hashCode());
		result = prime * result + pincode;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		if (districtId != other.districtId)
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (mobileNo == null) {
			if (other.mobileNo != null)
				return false;
		} else if (!mobileNo.equals(other.mobileNo))
			return false;
		if (pincode != other.pincode)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", email=" + email + ", mobileNo=" + mobileNo + ", pincode=" + pincode
				+ ", districtId=" + districtId + "]";
	}	
}
