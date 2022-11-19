package firstSeleniumProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseClass {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C://Users//ruksh//eclipse-workspace//libs//Browser_Driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.navigate().to("https://www.amazon.com/");
		
		driver.quit();
		
	}

}
