package com.assignment.action;

import java.util.ArrayList;
import java.util.Scanner;

import com.assignment.Address;
import com.assignment.Menu;

public class FindAddressAction implements Action {

	private ArrayList<Address> abook;
	private String findby;

	Scanner sc = new Scanner(System.in);

	public FindAddressAction(ArrayList<Address> book, String by) {
		abook = book;
		findby = by;

	}

	@Override
	public void execute() {

		switch (findby) {

		case "street":
			findByStreet();
			break;

		case "city":
			findByCity();
			break;

		case "pincode":
			findByPincode();
			break;
		default:
			break;

		}

	}

	public void findByStreet() {
		System.out.println("Enter Street to find :");
		String street = sc.next();

		for (Address a : abook) {
			if (a.isMatchedStreet(street))
			a.display();
		}

	}

	public void findByCity() {
		System.out.println("Enter City to find :");
		String city = sc.next();

		for (Address a : abook) {
			if (a.isMatchedCity(city))
			a.display();
		}

	}

	public void findByPincode() {
		System.out.println("Enter Pincode to find :");
		int pincode = sc.nextInt();

		for (Address a : abook) {
			if (a.isMatchedPincode(pincode))
			a.display();
		}
	}

	public String execute(String string, String msg) {
		// TODO Auto-generated method stub
		return null;
	}

}
