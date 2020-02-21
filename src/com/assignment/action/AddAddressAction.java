package com.assignment.action;

import java.util.ArrayList;
import java.util.Scanner;

import com.assignment.Address;

public class AddAddressAction implements Action {

	private ArrayList<Address> abook  ;
	
	public AddAddressAction(ArrayList<Address> book) {
		abook = book ;
	}

	@Override
	public void execute() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter address street") ;
		String street = sc.next();
		
		System.out.println("Enter address city") ;
		String city = sc.next();
		
		System.out.println("Enter address pincode") ;
		int pin = sc.nextInt() ;
		
		Address temp = new Address(street , city , pin) ;

		abook.add(temp);
	}

}
