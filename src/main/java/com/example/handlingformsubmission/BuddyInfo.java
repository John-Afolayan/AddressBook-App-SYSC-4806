package com.example.handlingformsubmission;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BuddyInfo {

	@Id
	private String name;
	private String phoneNum;
	private String address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Buddy [name=" + name + ", phoneNum=" + phoneNum
				+ ", address=" + address + "]";
	}

}
