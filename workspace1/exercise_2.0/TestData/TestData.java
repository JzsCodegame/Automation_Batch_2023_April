package TestData;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import febTestNg2023.Controler;
@Test
public class TestData extends Controler {
      
	
	
	@DataProvider(name = "login-data")
      public Object[][] getLoginData(){
    	  return new Object[][] {
    		  { "Tanvirr", "xyx@gmail1.com" },
              { "John", "john@gmail.com" },
              { "Mary", "mary@gmail.com" }
    	  };
    	  
      }
}
