package com.assignment.action;

import java.util.ArrayList;
import java.util.*;

import com.assignment.Address;
import com.assignment.MenuItem;

public class ExitAddressAction implements Action {

	//private ArrayList<Address> m;
	//MenuItem mi =m.add(new MenuItem("Exit"));
	
	@Override
	public void execute() {
		System.out.println("exit...");
		System.exit(0);
	}

}

