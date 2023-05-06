package Practice;

public class Calculator {

	static int add(int a, int b) {
		return a+b;
	}
	
	static double add(double x, double y) {
		System.out.println("Polymorphing Successfull");
		return x+y;
	}
	
	static String add(String a, String b) {
		System.out.println("Polymorphing Successfull");
		return a+b;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String c = " Again";
        int z = 1;
        int x = 6;
        int d = z + x;
		
        
        System.out.println(add(2, 2));
        System.out.println(Calculator.add(2.56, 2.56));
        System.out.println(add("Polymorphing Successfull", c.concat(" and Again")));
	}

}
