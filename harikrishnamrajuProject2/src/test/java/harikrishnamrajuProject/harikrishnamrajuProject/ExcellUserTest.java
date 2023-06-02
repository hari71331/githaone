package harikrishnamrajuProject.harikrishnamrajuProject;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pageObjectRepositorylib.Login;

public class ExcellUserTest {
public static WebDriver driver=Driver.getBrowser();
@Test
public void CreateUserTest() throws Exception{
	Login login = PageFactory.initElements(driver, Login.class);
	login.loginToApp();
	//login.verifyErrrorMessage();
}

}
