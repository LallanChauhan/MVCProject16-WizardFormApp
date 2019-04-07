package com.nt.command;

public class RegisterCommand {  
	private String userName;
	private String pass;
	private String emailId;
	private long phoneNo;
	private String city;
	private int pinCode;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	
	@Override
	public String toString() {
		return "RegisterCommand [userName=" + userName + ", pass=" + pass + ", emailId=" + emailId + ", phoneNo="
				+ phoneNo + ", city=" + city + ", pinCode=" + pinCode + "]";
	}
	
	

}
