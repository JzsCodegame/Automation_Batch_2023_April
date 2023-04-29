package Central;

import Practice.Vehicle;

public class Controller extends Vehicle {

	public Controller(String model, int year) {
		super(model, year);
		
	}

	public static void main(String[] args) {
		Controller x = new Controller("Bmw", 2023);
		System.out.println(x.numberofWheels);
		
		
	}
}
