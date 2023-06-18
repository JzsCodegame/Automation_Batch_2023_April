package ExcellReader;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Base.BasePage;

@Test
public class TestData extends BasePage {
      
	
	
	@DataProvider(name = "login-data")
      public Object[][] getLoginData(){
    	  return new Object[][] {
    		  { "Tanvirr", "xyx@gmail1.com" },
              { "John", "john@gmail.com" },
              { "Mary", "mary@gmail.com" }
    	  };
    	  
      }
}
