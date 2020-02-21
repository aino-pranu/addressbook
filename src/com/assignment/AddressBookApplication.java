package com.assignment;

import java.util.ArrayList;

import com.assignment.action.AddAddressAction;
import com.assignment.action.DisplayAddressBookAction;
import com.assignment.action.DisplayMenuAction;
import com.assignment.action.ExitAddressAction;
import com.assignment.action.FindAddressAction;
import com.assignment.action.DeleteAddressAction;

public class AddressBookApplication {

	ArrayList<Address> book = new ArrayList<Address>();

	public void run() {
		Menu m = new Menu("==========Address Book Application=============");
		m.addItem(1, "Add Address", new AddAddressAction(book));
		m.addItem(2, "Display Address", new DisplayAddressBookAction(book));
		m.addItem(3, "Delete Address", new DeleteAddressAction(book));
		
		
		Menu findAddress = new Menu("******Find Address*****");
		findAddress.addItem(1, "Find By Street", new FindAddressAction(book,"street"));
		findAddress.addItem(2, "Find By City", new FindAddressAction(book,"city"));
		findAddress.addItem(3, "Find By Pincode", new FindAddressAction(book,"pincode"));
		m.addItem(4,findAddress,new DisplayMenuAction(findAddress));
		m.addItem(5, "Exit", new ExitAddressAction());
		findAddress.addItem(4, "Go To Main Menu", new DisplayMenuAction(m));
		new DisplayMenuAction(m).execute();
		
		
		
		
		//m.run();

	}

	public static void main(String[] args) {
		AddressBookApplication app = new AddressBookApplication();
		app.run();
	}

}
