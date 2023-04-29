package Practice;

public class Bike {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     suzuki z = new suzuki();
      z.startbike();
       z.accelaratebike();
        z.shiftgear();
	
	}

}

class yamaha implements Rider {
	
	public void startbike(){
		System.out.println("lets Go");
	}
	public void accelaratebike() {
		System.out.println(" Bike is moving 100mph");
	}
	public void shiftgear() {
		System.out.println("Gear is at 5th");
	}
}

class suzuki implements Rider {
	public void startbike(){
		System.out.println("lets Go");
	}
	public void accelaratebike() {
		System.out.println(" Bike is moving 100mph");
	}
	public void shiftgear() {
		System.out.println("Gear is at 5th");
	}
}

