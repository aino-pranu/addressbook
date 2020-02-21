package com.assignment;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.assignment.action.Action;

public class Address {

	private String street, city;
	private int pincode;
	private Action action;

	public Address(String street, String city, int pincode) {

		this.street = street;
		this.city = city;
		this.pincode = pincode;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public void display(int i) {
		System.out.println(i + "\t" + street + "\t" + city + "\t" + pincode);

	}

	public boolean isMatchedStreet(String str) {
		return this.street.contains(str);
	}

	public boolean isMatchedCity(String str) {
		return this.city.contains(str);
	}

	public boolean isMatchedPincode(int pin) {
	     return (this.pincode == pin);
	 }

//	public boolean validPincode(CharSequence pincode1) {
//
//		Pattern pattern = Pattern.compile("\\d(6)");
//		Matcher matcher = pattern.matcher(pincode1);
//
//		if (matcher.matches()) {
//
//			System.out.println(pincode1 + " = valid pincode number");
//		} else {
//			System.out.println(pincode1 + " = Invalid pincode number");
//		}
//		return true;
//
//	}

	public void indexOf(ArrayList<Address> abook) {

	}

	public void display() {
		System.out.println(street + "\t" + city + "\t" + pincode);

	}

}
