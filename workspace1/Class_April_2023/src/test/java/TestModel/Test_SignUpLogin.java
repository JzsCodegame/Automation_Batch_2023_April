package TestModel;

import org.testng.annotations.Test;

import Base.BasePage;





//import TestData.SignUpData;

public class Test_SignUpLogin extends BasePage{
	
	@Test(priority = 0)
	public void test_SignUp() throws InterruptedException {
		
		login.OpenApp(AppUrl);
		login.getSignInTitle();
		login.Click_SignUpLogin();
		login.Enter_UserName("Tahir");
		login.Enter_EmailAddress("xuz@gmail.com");
		login.click_AccountButton();
		} 
	@Test(priority = 1)
	public void test_SignUp2() throws InterruptedException {
		
		login.fillupformSignIn(AppUrl, "Tahir", "xuz@gmail.com");
		} 
	@Test(priority = 2, invocationCount = 2)
	public void test_SignUp_FillForm() throws InterruptedException {
		
		fill.fillUpform("22","January","Tanvir");
		} 
}
