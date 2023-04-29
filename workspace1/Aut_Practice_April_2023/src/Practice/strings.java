package Practice;

public class strings {

	public static void main(String[] args) {
		String message = "Hello world" + "!!"; // Index start from 0
						//012345678910   1112
		
		System.out.println(message);
		System.out.println(message.endsWith("ld!!"));
		System.out.println(message.startsWith("Heo"));
		System.out.println(message.length());
		System.out.println(message.indexOf("!!"));
		System.out.println(message.replace("!", "*"));
		System.out.println(message.charAt(6));
		System.out.println(message.toUpperCase());
		System.out.println(message.toLowerCase());
		System.out.println(message.trim());
		
		
		
		
		

	}

}
