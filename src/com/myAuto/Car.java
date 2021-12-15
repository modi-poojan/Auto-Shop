package com.myAuto;

//Creating a superclass Car
public class Car {

	int speed;
	double regularPrice;
	String color;

	// Constructor Car so that the child class can access this variables
	public Car(int speed, double regularPrice, String color) {

		this.speed = speed;
		this.regularPrice = regularPrice;
		this.color = color;

	}

	// Method getSalePrice which returns original price of car
	public double getSalePrice() {
		System.out.println("-------For CAR--------");
		return regularPrice;
	}

}
