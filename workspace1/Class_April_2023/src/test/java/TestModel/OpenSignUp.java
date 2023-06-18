package TestModel;

//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;


import org.testng.annotations.Test;

import Base.BasePage;
import ExcellReader.SignUpData;


//import Pages.SignIn;
//import Pages.SignUp;



@Test
public class OpenSignUp extends BasePage{

	
	
	/* @Test(priority = 0, dataProvider = "login-data", dataProviderClass = TestData.class)
	public void testlogin(String username, String email) {
	//login = new SignIn(driver);
	  //login.OpenApp(AppUrl);
		//login.ClickSignIn();
			login.fillupformSignIn(AppUrl, username, email);
				Reporter.log("Test completed successfully.", true);
	}*/
	
	 @Test(priority = 1, dataProvider = "signup-data", dataProviderClass = SignUpData.class)
	public void testSignUp(String Username, String Password, String Day, String Month, String FirstName) throws InterruptedException {
		Thread.sleep(3000);
		//SignUp form = new SignUp(driver);
		login.fillupformSignIn(AppUrl, Username, Password);
		fill.fillUpform(Day, Month, FirstName);
	} 
}
