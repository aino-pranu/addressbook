package com.assignment.action;

import java.util.ArrayList;

import com.assignment.Address;

public class DisplayAddressBookAction implements Action {

	private ArrayList<Address> abook;
	private Address a;

	public DisplayAddressBookAction(ArrayList<Address> book) {
		abook = book;
	}

	@Override
	public void execute() {
		System.out.println("index\t street\t city\t pincode\t");

		for (Address a : abook) {
			a.display(abook.indexOf(a));
		
		}
	}
}
