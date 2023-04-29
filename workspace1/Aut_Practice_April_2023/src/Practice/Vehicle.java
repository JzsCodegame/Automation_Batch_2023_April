package Practice;

public class Vehicle {
	
   protected int numberofWheels = 4;   //global variable
	
    
    
	int year;
	
    String model = "BMW";
	
	float price = 55000.56f;
	
    static Vehicle carx;
    
    int drive ;

    public Vehicle(String model, int year) {
    	//super();
    	this.model = model;
    	this.year = year;
    	
    }
    
	void start() {
		brake();
		String keytype = "button";
		carx = new Vehicle("Rx7", 2020);
		System.out.println("Press Start the " + keytype +" " + "for :"
		+ model);
		}
	
	void brake() {
		System.out.println("User Steps on the break");
	}
	
	void changegear(int park, int drive) {
		//int park = 1;
		//int drive = 2;
		System.out.println("user changes the gear number to :" + drive);
		
		
	}
	 static int accelerate(int speed) {
		 
		 carx = new Vehicle("Rx8", 2019);
		 System.out.println(carx.model +"-"+ carx.year);
		 return speed;
				 
	 }
	
	
	public static void main(String[] args) {
		
		Vehicle car;
		car = new Vehicle("rx9", 2022);
		
		carx = new Vehicle("rx10",2023);
		
	    System.out.println(car.model + " " + "Price of the car :" + car.price +
	    		" "+"year: " + car.year);
		carx.start();
		carx.changegear(1, 5);
		
	    car.numberofWheels = 5;
		System.out.println("Car starts to move at :" + accelerate(50) + "mph" + " "+
		"number of wheels : " + car.numberofWheels);

	}

}
