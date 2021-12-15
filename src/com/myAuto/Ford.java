package com.myAuto;

//Class Ford is a sub class of Car
public class Ford extends Car {
	
	int year;
	int manufacturerDiscount;
	
	// Constructor to pass values while creating object
	public Ford(int speed, double regularPrice, String color, int year, int manufacturerDiscount) {
		
		super(speed,regularPrice,color);
		this.year = year;
		this.manufacturerDiscount = manufacturerDiscount;
	}
	
	// This method returns the price after discounting
	public double getSalePrice() {
		
		System.out.println("--------For FORD-----------");
		System.out.println("Price before any discount is "+ regularPrice);
		System.out.println("Discount offered = "+manufacturerDiscount+"%");
		return (regularPrice -= (regularPrice*manufacturerDiscount/100)); 
	}

}
