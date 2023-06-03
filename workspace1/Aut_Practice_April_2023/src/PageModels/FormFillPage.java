package PageModels;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import Central.Controller;

//import febTestNg2023.ValidationsFactory;

public class FormFillPage extends Controller {
	//ValidationsFactory validate;
	//WebDriverWait Ex1;


	    @FindBy(css="#id_gender1")
		WebElement Mr;
		
		@FindBy(css="input[id='id_gender2']")
		WebElement Mrs;
		
		@FindBy(css="select[name*='days']")
		WebElement Days;
		
		@FindBy(css="select[name*='months']")
		WebElement Month;
		
		
	    @FindBy(css="input[id='optin'][value='1']")
		WebElement CheckBox1;
	    
	    @FindBy(css="input[id^='first']")
		WebElement FirstName;

	public FormFillPage(WebDriver driver) {
		super();
		this.driver=driver;
		//this.Ex = new WebDriverWait(driver, 30);;
		//validate = new ValidationsFactory(driver, this);
		PageFactory.initElements(driver, this);
		
	}

	public void select_Mr() {
		Mr.click();
		//validate.assertElementSelected2(Mr);
		
	}

	public void select_Mrs() {
		Mrs.click();
		//validate.assertElementEnabled2(Mrs);
	}

	public void select_Days(String inputdays) throws InterruptedException {
		//Days.click();
		Thread.sleep(2000);
		
		// String inputdaysStr = Double.toString(inputdays);
		Select sinput = new Select(Days);
		Thread.sleep(2000);
		
		sinput.selectByValue(inputdays);
		Thread.sleep(2000);
		//validate.assertDropdownSelected2(Days, inputdays);
	} 
	public void select_Month(String inputmonth) throws InterruptedException {
		//Days.click();
		Thread.sleep(2000);
		
		// String inputdaysStr = Double.toString(inputdays);
		Select sinput = new Select(Month);
		Thread.sleep(2000);
		
		sinput.selectByVisibleText(inputmonth);
		Thread.sleep(2000);
		//validate.assertDropdownSelected2(Days, inputdays);
	} 



	public void Click_CheckBox1() {
		CheckBox1.click();
		
		//SignUp.assertCheckboxSelected2(CheckBox1);
	}
	public void Enter_FirstName(String name) {
		//Ex.until(ExpectedConditions.elementToBeClickable(FirstName));
		js.executeScript("arguments[0].scrollIntoView(true);", FirstName);
		Ex.until(ExpectedConditions.visibilityOf(FirstName));
		FirstName.click();
		FirstName.sendKeys(name);
		//validate.assertXpath1(FirstName, name);
	}

	public void fillUpform(String inputdays, String name, String inputmonth) throws InterruptedException {

		this.select_Mr();
		this.select_Mrs();
		this.select_Days(inputdays);
		this.select_Month(inputmonth);
		this.Click_CheckBox1();
		this.Enter_FirstName(name);
		
		

	}
}
