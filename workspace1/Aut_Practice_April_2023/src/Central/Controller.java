package Central;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Controller {

	public static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "msedgedriver.exe");
		driver = new EdgeDriver();
		driver.get("https://www.google.com");
	}
}
