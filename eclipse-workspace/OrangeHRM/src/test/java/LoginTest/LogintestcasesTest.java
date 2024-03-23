package LoginTest;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import BaseTest.BaseTest;
import pom.Loginpage;

public class LogintestcasesTest extends BaseTest {

	Loginpage P;

	@Test
	public void loginit() throws InterruptedException, IOException {
		P = new Loginpage(driver);
		Thread.sleep(2000);
		P.loginprocess("Admin", "admin123");
		Thread.sleep(2000);

	}
}
