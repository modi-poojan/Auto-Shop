package com.myAuto;

//Class Sedan is sub class of Car 
public class Sedan extends Car {

	int length;
	
	// Constructor to assign value while creating object
	public Sedan(int speed, double regularPrice, String color, int length) {
		
		super(speed, regularPrice, color);
		this.length = length;
	}
	
	// This method returns discounted price after comparing length
	public double getSalePrice() {
		if (length > 20) {
			System.out.println("---------For SEDAN-----------");
			System.out.println("Price before discount = "+regularPrice);
			System.out.println("Discount offered is: " +(regularPrice * 5 / 100));
			return (regularPrice -= (regularPrice * 5 / 100));	
		}
		else {
			System.out.println("---------For SEDAN-----------");
			System.out.println("Price before disccount = "+ regularPrice);
			System.out.println("Discount offered = "+ (regularPrice * 10 / 100));
			return (regularPrice -= (regularPrice * 10 / 100));
		}
	}
	
}