package Practice;

import java.util.Scanner;

public class scannerInput {
	static Scanner in;
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
        String c = "Enter first number:";
        String d = "Enter the second number: ";
         in = new Scanner(System.in);
         System.out.println(c);
       int a = in.nextInt();
       System.out.println(d);
		   int b = in.nextInt();
    		   
		System.out.println(add(a, b));
        System.out.println(Calculator.add(2.56, 2.56));
        System.out.println(add("Polymorphing Successfull", c.concat(" and Again")));
	}

}
