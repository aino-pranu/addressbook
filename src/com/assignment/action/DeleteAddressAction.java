package com.assignment.action;

import java.util.ArrayList;
import java.util.Scanner;

import com.assignment.Address;

public class DeleteAddressAction implements Action {

	private ArrayList<Address> abook;
	private String findby;
	private int index;
	

	public DeleteAddressAction(ArrayList<Address> book, String by) {
		abook = book;
		findby = by;

	}
	
	Scanner sc = new Scanner(System.in);
	
	public DeleteAddressAction(ArrayList<Address> book) {
		abook = book ;
	}
	
	@Override
	public void execute() {
		
		System.out.println("Enter index no which u want to delete : \n");
		index = sc.nextInt();
		
		abook.remove(index);
		System.out.println("Deleted successfully");
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	public void execute() {
//		switch (findby) 
//		{
//
//		case "street":
//			deleteByStreet();
//			break;
//
//		case "city":
//			deleteByCity();
//			break;
//
//		case "pincode":
//			deleteByPincode();
//			break;
//		}
//
//	}
//	
//	private void deleteByStreet() {
//		
//	}
//
//	
//	private void deleteByCity() {
//		
//	}
//
//	private void deleteByPincode() {
//		
//	}
	
	
	
	
	
	

//	public  void search(){
//		System.out.println("what you want to search : \n");
//		String str = sc.next();
//		
//		
//		
//        for(String city: city){
//            if(city.equals(str)){
//               System.out.println("Found elements in Java array using for loop");
//            }
//        }
//
//		
//		if(abook.contains(str)) {
//			System.out.println("Element found");
////			abook.remove(str);
////			System.out.println("Deleted Successfully");
////			//System.out.println("the ramaing address is "+abook);
////			return abook;
//		}
//
//	}
}
