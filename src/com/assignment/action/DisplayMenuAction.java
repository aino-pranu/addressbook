package com.assignment.action;

import com.assignment.Menu;

public class DisplayMenuAction implements Action {
	
	private Menu menu;

	public DisplayMenuAction(Menu findAddress) {
		this.menu = findAddress;
	}

	@Override
	public void execute() {
		menu.display();

	}

}
