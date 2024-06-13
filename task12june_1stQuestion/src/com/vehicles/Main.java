package com.vehicles;

public class Main {
	public static void main(String[]args) {
		Car car = new Car("TATA","BOLERO", 5);
		
		Truck truck = new Truck("Mahindra", "Ashok Leyland", 8.122);
		
		System.out.print("Show the Details of Car : ");
		car.displayDetails();
		
		System.out.println("Show the Details of Truck : ");
		truck.displayDetails();
	}

}
