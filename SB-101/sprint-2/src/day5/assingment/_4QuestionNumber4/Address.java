package day5.assingment._4QuestionNumber4;

import java.io.Serializable;

public class Address implements Serializable{
	private String state;
	private String city;
	private int pinCode;
	
	
	
	
	
	
	public Address(String state, String city, int pinCode) {
		super();
		this.state = state;
		this.city = city;
		this.pinCode = pinCode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
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
		return "Address [state=" + state + ", city=" + city + ", pinCode=" + pinCode + "]";
	}
	
	
	

}
