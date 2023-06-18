package PageModels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Central.Controller;

//import pages.Validations;

public class SignupPageFactory extends Controller {
	
	
	By SignUpLogin = By.xpath("//a[@href='/login']");
	By UserName = By.xpath("//input[@name='name']");
	By EnterEmail= By.xpath("//input[starts-with(@data-qa, 'signup')][position()=2]");
	By SubmitButton= By.xpath("//button[contains(@data-qa,'signup-button')]");
	
	
	public SignupPageFactory(WebDriver driver) {
		super();
		this.driver = driver;
		//validate = new Validations(driver, EnterEmail);
		
	}
	
	public void OpenApp(String AppUrls) {
		driver.get(AppUrls);	
		}
	  
	
	
public String getSignInTitle() {

	      return driver.getTitle();
	    }
	    
	  public void Click_SignUpLogin() {

	       driver.findElement(SignUpLogin).click();
	       
	   	//validate.assertElementPresent(SignIn);
	    }
	  
	    //Set email in email textbox

	    
	  public void Enter_UserName(String username) {

	       driver.findElement(UserName).sendKeys(username);
	       //validate.assertTrue(true, username);
	       

	    }
	  
	  public void Enter_EmailAddress(String email) {

	       driver.findElement(EnterEmail).sendKeys(email);
	       try {
	           Thread.sleep(2000); // wait for 1 second to allow the input field to be updated
	       } catch (InterruptedException e) {
	           e.printStackTrace();
	       }
	       
	       //validate.assertXpath(EnterEmail, email);

	    }
	    
	  //Click on Create Account button

	    public void click_AccountButton() {
	    	//validate.assertElementEnabled(SubmitButton);
	            driver.findElement(SubmitButton).click();
	            

	    }
	    
	    public void fillupformSignIn(String AppUrls, String usernameX, String emailX) {
	    	this.OpenApp(AppUrls);
	    	this.Click_SignUpLogin();
	    	this.Enter_UserName(usernameX);
	    	this.Enter_EmailAddress(emailX);
	    	this.click_AccountButton();
	    	
	    	
	    	}
}
