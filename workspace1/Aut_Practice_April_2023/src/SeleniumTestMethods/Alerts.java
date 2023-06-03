package SeleniumTestMethods;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Central.Controller;

public class Alerts extends Controller {

	
	@Test
	public void alerts() throws InterruptedException {
		// TODO Auto-generated method stub
		

		//WebDriver driver = new ChromeDriver();

		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\jzo_0\\eclipse-workspace\\alertPractice\\chromedriver.exe");
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.id("name")).click();

		driver.findElement(By.id("name")).sendKeys("Ra");

		driver.findElement(By.cssSelector("[id='alertbtn']")).click();
		
		Thread.sleep(3000);

		System.out.println(driver.switchTo().alert().getText());

		driver.switchTo().alert().accept();

		driver.findElement(By.id("confirmbtn")).click();

		System.out.println(driver.switchTo().alert().getText());
		
		driver.switchTo().alert().accept();
	}
}
