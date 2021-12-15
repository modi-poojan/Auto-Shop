package com.myAuto;

//Truck is a subclass for Car it can uses properties of car
public class Truck extends Car {

	public int weight;

	// Constructor to initialize object
	public Truck(int speed, double regularPrice, String color, int weight) {
		
		super(speed, regularPrice, color); 			// Super is used to access variables of Car Class
		this.weight = weight;
	}

	// This method is to return discounted price of Truck by comparing weight
	public double getSalePrice() {
		
		if (weight > 2000) {
			System.out.println("----For TRUCK-------");
			System.out.println("Price before discount is " + regularPrice);

			return (regularPrice -= (regularPrice * 10 / 100));
		} else {
			System.out.println("----For TRUCK-------");
			System.out.println("Price before discount is " + regularPrice);
			System.out.println("Discount offerd " + (regularPrice * 20 / 100));
			return (regularPrice -= (regularPrice * 20 / 100));
		}
	}
}
