package harikrishnamrajuProject.harikrishnamrajuProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
	public static WebDriver driver;
public static WebDriver getBrowser() {
	
	if (constants.browser.equalsIgnoreCase("Chrome")) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	/*
	 * else if (constants.browser.equalsIgnoreCase("Firefox")) {
	 * System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+
	 * "\\Drivers\\chromedriver.exe"); driver = new ChromeDriver();
	 * 
	 * } else if (constants.browser.equalsIgnoreCase("Safari")) {
	 * System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+
	 * "\\Drivers\\chromedriver.exe"); driver = new ChromeDriver();
	 * 
	 * }
	 */
		
	return driver;
	
}
}
