package harikrishnamrajuProject.harikrishnamrajuProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import dev.failsafe.internal.util.Assert;

public class WebDriverCommonlib {
	public static WebDriver driver= Driver.driver;
	public static WebDriverCommonlib wlib = new WebDriverCommonlib();
	public static Actions act = null;			
	
	/**
	 * this method waits for page to load and displayed when mouseover on waitForPageToLoad()
	 */
	public void waitForPageToLoad() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(constants.globalwait));
	}
public void waitForElementPresent() {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(constants.globalwait));
	//@8:20 from class 21 recording
	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@id='login2']")));// //a[@id='login2']
}
	
public void waitForXpathPresent(String xpath) {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(constants.globalwait));
	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));// //a[@id='login2']	
}

public void verifytext(String xpath, String expectedValue) {
	//wlib.waitForPageToLoad();
	WebElement element = driver.findElement(By.xpath(xpath));
	String actualtext= element.getText();
	//Assert.assertEquals(actualtext,expectedValue,"matched"); see assert video as assertEquals is not coming after Assert.
	if (expectedValue.equalsIgnoreCase(actualtext)) {
		System.out.println("DATA MATCHED");
	}
	else {
		System.out.println("DATA NOT MATCHED");
	}
}
public static void swithchToAlert() {
	driver.switchTo().alert();
}
public static void swithToWindow(String Windowid) {
	driver.switchTo().window(Windowid);
}
public static void dragAndDrop(String fromxpath, String toXpath) {
	WebElement from= driver.findElement(By.xpath(fromxpath));
	WebElement to= driver.findElement(By.xpath(toXpath));
	Actions act = new Actions(driver);
	act.dragAndDrop(from, to).build().perform();
}
public static void maximize() {
	driver.manage().window().maximize();
}
}
