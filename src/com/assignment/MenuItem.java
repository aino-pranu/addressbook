package com.assignment;

import com.assignment.action.Action;

public class MenuItem {
	private int ch;
	private String text_display;
	private Action action;
	private Menu parent;
	
	public MenuItem() {
		}	
	
	public MenuItem(int ch, String text_display, Action action) {
		super();
		this.ch = ch;
		this.text_display = text_display;
		this.action = action;
	}

	public MenuItem(String text_display) {
	this.text_display=text_display;
	}

	public int getCh() {
		return ch;
	}

	public void setCh(int ch) {
		this.ch = ch;
	}

	public String getText_display() {
		return text_display;
	}

	public void setText_display(String text_display) {
		this.text_display = text_display;
	}

	public void display() {
		System.out.println(ch + " : " + text_display);
	}
	
	public boolean isSelected(int option) {
		if (option == ch) {
			action.execute();
			return true ;
		}
		else return false;
	}
	
	public Action getAction() {
		return action;
	}
	public void setAction(Action act) {
		this.action = act;
	}

	public Menu getParent() {
		return parent;
	}

	public void setParent(Menu parent) {
		this.parent = parent;
	}

	
	
}
