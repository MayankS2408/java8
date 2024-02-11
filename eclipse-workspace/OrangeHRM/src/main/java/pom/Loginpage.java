package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseTest.BaseTest;


public class Loginpage {

	   WebDriver driver;
	   Loginpage P;
	   BaseTest B;
	   
	    @FindBy(xpath = "//input[@name='username']")
	    WebElement userName;
	 
	    @FindBy(name = "password")
	    WebElement Password;
	 
	    @FindBy(id = "logInPanelHeading")
	    WebElement titleText;
	 
	    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
	    WebElement login;
	    
	    @FindBy(xpath="//a[@href='/web/index.php/admin/viewAdminModule']")
	    WebElement admin;
	    
	    public Loginpage(WebDriver driver) {
	    	this.driver=driver;
	    	PageFactory.initElements(driver, this);
	    }
	    
	    public void setusername(String uname) {
	    	userName.sendKeys(uname);
	    }
	    
	    public void setpassword(String pass) {
	    	Password.sendKeys(pass);
	    }
	    
	    public void clickonlogin() {
	    	login.click();
	    }
	    
	    public void clickonadmin() {
	    	admin.click();
	    }
	    
	    public void loginprocess(String uname,String pass) throws InterruptedException {
	    	
//			BaseTest.Waits(userName, 5000);
	    	this.setusername(uname);
	    	this.setpassword(pass);
	    	this.clickonlogin();
	    	Thread.sleep(2000);
//	    	BaseTest.Waits(admin, 5000);
	    	this.clickonadmin();
	    	Thread.sleep(2000);
	    }
}
