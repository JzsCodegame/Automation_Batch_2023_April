package TestModel;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Central.Controller;
@Test
public class SignUp extends Controller {
	
	@Test(priority = 0)
	public void OpenBrowser() {
		driver.get(AppUrl);
	}
	@Test(priority = 1)
	public void ClickSignin() {
		driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")).click();
	}
	@Test(priority = 2)
	public void EnterUsername() {
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Tanvir");
	}
	@Test(priority = 3)
	public void EnterEmailAddress() {
		driver.findElement(By.xpath("//input[starts-with(@data-qa, 'signup')][position()=2]")).sendKeys("xyz@yahoo.com");
	}
	@Test(priority = 4)
	public void ClickSubmitbutton() {
		driver.findElement(By.xpath("//button[contains(@data-qa,'signup-button')]")).click();
	}
	
	
	 
	 
	
}
