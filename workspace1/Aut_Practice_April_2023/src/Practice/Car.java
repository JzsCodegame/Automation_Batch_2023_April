package Practice;

public class Car extends Vehicle {
	
	public Car(String model, int year) {
	    super(model, year);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Car x = new Car("Bmw",2023);
        
        x.start();
        System.out.println(x.numberofWheels);
	}

}
