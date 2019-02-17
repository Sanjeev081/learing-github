package Com.crm.qa.pages;

import java.sql.Driver;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.crm.qa.base.TestBase;
public class Loginpage extends TestBase{
	Loginpage loginpage;
	Homepage homepage;
	
	//page factory-OR:
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	
	@FindBy(xpath= "//*[@id=\"loginForm\"]/div/div/input")
	WebElement loginbtn;
	
	@FindBy(xpath="//font[contains(text(),'Sign Up')]")
	WebElement  signupbtn;
	
	@FindBy(xpath="/html/body/div[2]/div/div[1]/a/img")
	WebElement crmlogo;
	//initializing the page object:
	public Loginpage() {
		PageFactory.initElements(driver, this);
		
	}
	//action

	public String validateloginpageTtitle() {
		return driver.getTitle();
		
	}
	public boolean validateCRMimage() {
		return crmlogo.isDisplayed();
		
	}
	public Homepage login(String un, String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		//loginbtn.click();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", loginbtn);
		return new Homepage();
		
	}
	

	

}
