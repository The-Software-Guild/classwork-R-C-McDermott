package com.ryan.question1;

public class Road {

	public static void main(String[] args) {
		Car car = new Car("Honda", "CVVX214");
		Bus bus = new Bus("Double decker", "VGSF234");
		Truck truck = new Truck("Lorry", "VCVX142");
		
		car.displayCarMessage(); 		// Car only method
		car.displayInfo(); 				// Vehicle method
		
		bus.displayBusMessage(); 		// Bus only method
		bus.displayInfo();				// Vehicle method
		
		truck.displayTruckMessage();	// Truck only method	
		truck.displayInfo();			// Vehicle method
		
		
		


	}

}
