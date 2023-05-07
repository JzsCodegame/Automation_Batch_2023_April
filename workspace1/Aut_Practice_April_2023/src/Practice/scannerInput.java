package Practice;

import java.util.Scanner;

public class scannerInput {
	static Scanner in;
	static int add(int a, int b, int c) {
		return a*b*c;
	}
	
	static double add(double x, double y) {
		System.out.println("Polymorphing Successfull");
		return x+y;
	}
	
	static String add(String a, String b, String z) {
		System.out.println("Polymorphing Successfull");
		return a+b+z;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String c = "Enter first number:";
        String d = "Enter the second number: ";
        String z = "Enter the third number: ";
        String x = "The result of the sum is : ";
         in = new Scanner(System.in);
         
         System.out.println(c);
          int a = in.nextInt();
           System.out.println(d);
         int b = in.nextInt();
          System.out.println(z);
           int e = in.nextInt();
           System.out.println(x);
		
             
             
        System.out.println(add(a, b, e));
        //System.out.println(Calculator.add(2.56, 2.56));
        //System.out.println(add("Polymorphing Successfull", c.concat(" and Again")));
	}

}
