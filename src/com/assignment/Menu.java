package com.assignment;

import java.util.ArrayList;
import java.util.Scanner;

import com.assignment.action.Action;
import com.assignment.action.DisplayMenuAction;

public class Menu extends MenuItem {


	public Menu( String text_display) {
		super( text_display);
	}

	private ArrayList<MenuItem> list = new ArrayList<MenuItem>();
	Scanner sc = new Scanner(System.in);

	public void addItem(int ch, String menu, Action act) {
		MenuItem m = new MenuItem(ch, menu, act);
		list.add(m);
		m.setParent(this);
	}

	public void addItem(int ch, Menu menu, Action act) {
		menu.setCh(ch);
		menu.setAction(act);
		list.add(menu);
		menu.setParent(this);

	}

	public void display() {
		while (true) {

			System.out.println(getText_display());
			//System.out.println("============================");
			for (MenuItem m : list) {
				if (m instanceof Menu) {
					((Menu) m).displayAsMenuItem();
				} else {
					m.display();
				}
			}
			System.out.println("Enter your choice:");
			int choice = sc.nextInt();
			for (MenuItem m : list) {
				if (m.isSelected(choice))
					break;
			}
		}
	}

	public void displayAsMenuItem() {
		System.out.println(getCh() + " : " + getText_display());
	}

	public void run() {
		int option;

		while (true) {

			this.display();
			Scanner sc = new Scanner(System.in);

			System.out.println("Enter an option");
			option = sc.nextInt();

			for (MenuItem mi : list) {
				if (mi.isSelected(option))
					break;
			}
		}

	}

	

}
