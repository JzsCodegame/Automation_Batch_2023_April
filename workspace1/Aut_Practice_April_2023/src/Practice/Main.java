package Practice;

class Main {
	
	
	
	
	public static void main(String[] args) {
		secondchild x = new secondchild();
		x.abstractMethod();
		x.display();
	}
}

class secondchild extends abstractClass {
	public void abstractMethod() {
		System.out.println("Abstract is confusing");
	}
}
 abstract class abstractClass {
	public abstract void abstractMethod();
	void display() {
		System.out.println("Concrete Method");
	}
	
	}

