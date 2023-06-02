package pageObjectRepositorylib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import harikrishnamrajuProject.harikrishnamrajuProject.Driver;
import harikrishnamrajuProject.harikrishnamrajuProject.ExcelLib;
import harikrishnamrajuProject.harikrishnamrajuProject.WebDriverCommonlib;
import harikrishnamrajuProject.harikrishnamrajuProject.constants;

public class Login {
WebDriverCommonlib webLib = new WebDriverCommonlib();
WebDriver driver = Driver.driver;
ExcelLib excel= new ExcelLib();

static String expectedErrorMessage = "copy form facebook erro message";



@FindBy (id ="login2")
private WebElement Loginbtn;

@FindBy (id="loginusername")
private WebElement UsernameEdit;

@FindBy (id="loginpassword")
private WebElement PasswordEdit;

public void loginToApp() throws Exception {
	driver.get(constants.url);
	WebDriverCommonlib.maximize();
	
	Loginbtn.click();
	UsernameEdit.sendKeys(excel.getstringExcelData("Sheet1",0,2));
	PasswordEdit.sendKeys(excel.getstringExcelData("Sheet1",0,3));
	driver.close();
}

}
