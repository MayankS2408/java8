package BaseTest;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;

import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	public static WebDriver driver;

	@BeforeTest
	public void setup() throws Exception {

		driver = WebDriverManager.chromedriver().create();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	}

//	public static void Waits(WebElement element, int timeinscond) {
//
//		WebDriverWait wait = new WebDriverWait(driver, timeinscond);
//		wait.until(ExpectedConditions.visibilityOf(element));
//
//	}

	public static void Screenshot() throws IOException {

		Date date= new Date();
		String screenshotname=date.toString().replace(" ","-").replace(" ","-");
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Files.copy(file, new File("C:\\Users\\hp\\eclipse-workspace\\OrangeHRM\\Screenshots" + System.currentTimeMillis()+ ".jpg"));

	}
}