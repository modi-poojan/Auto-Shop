package com.myAuto;

public class MyNewAutoShop {

	public static void main(String[] args) {
		
		Sedan call = new Sedan(180, 14857.078, "Purple", 7);							// Creating object for Sedan 
		System.out.println("Sale Price after discount = "+call.getSalePrice()+"\n");	// Printing the discounted value using getSalePrice
			
		Ford ford1 = new Ford(200, 750570, "White", 2021, 15);							// Creating object for Ford
		System.out.println("Sale price after discount = "+ ford1.getSalePrice()+"\n");	// Printing discounted value
		
		Ford ford2 = new Ford(200, 840000, "Silver", 2022, 7) ;							// Creating 2nd object for Ford 
		System.out.println("Sale price after discount = "+ford2.getSalePrice()+"\n");	// Printing Value
		
		Car car = new Car(200, 700000, "Maroon");										// Creating object for Car 
		System.out.println("Value of Car = "+car.getSalePrice());						// Printing original of car using getSalePrice			
	}
}
