package Practice;

public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int temp = 32;
       int tempVa = 37;
       boolean iswarm = (temp > 20 && tempVa > 35);
                    // not(true   and      false)
                    // not (false)
                    //  true
       boolean ishot = (temp > 20 || tempVa < 35);
                    // not   true
                    // false
      
       if (temp != tempVa) {
    	   for (int i = 0; i < 5; i++) {
    	   System.out.println("Its warm :"+ iswarm);
    	   }
       } else {
    	   System.out.println("False : Its cold outside");
       }
	
	
	
	}

}
