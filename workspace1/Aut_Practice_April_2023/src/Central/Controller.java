package Central;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageModels.FormFillPage;
import PageModels.SignupPageFactory;
@Test
public class Controller {

	public static WebDriver driver;
	 public static String AppUrl;
	  public static JavascriptExecutor js;
	   public static WebDriverWait Ex;
	    public ChromeOptions options;
	     private String WindowHandle;
	      public Actions act;
	       public SignupPageFactory login;
	       public FormFillPage fill;
@BeforeSuite 
	public void SetupSuite() {
		//System.setProperty("webdriver.edge.driver", "msedgedriver.exe");
		System.setProperty("webdriver.chrome.driver", "chromedriver-114.exe");
		AppUrl = "https://automationexercise.com/";
		options = new ChromeOptions();
		options.addArguments("--headless=new");
}
 @BeforeTest
     public void Testconfig(){
        	//driver = new EdgeDriver();
        	driver = new ChromeDriver(options);
        	js = (JavascriptExecutor) driver;
        	WindowHandle = driver.getWindowHandle();
        	act = new Actions(driver);
        }
  @BeforeClass
       public void Synchronize() {
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	  driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	
	    
}
  @BeforeMethod() 
	public void BrowserConfig() {
		 //We maximize or change browser based on our preference.
	  
	  login = new SignupPageFactory(driver);
	  fill = new FormFillPage(driver);
		Ex = new WebDriverWait(driver, 15);
	}
  @AfterMethod()
	public void validations(){
  	System.out.println("Validations succesfully");// We validate our code executions.
  	System.out.println("Method executed succesfully");
  	//Ex = new WebDriverWait(driver, 10);
  }
  @AfterTest()
	public void BrowserClosing() {

	    // Close the window and switch back to the original window
	    driver.close();
	    //driver.switchTo().window(originalWindowHandle);
	}
   @AfterSuite
	public void terminate() {
		driver.quit(); // We close the instance and terminate the session. It will erase all the cache memory and make our next execution better.
	}
}
