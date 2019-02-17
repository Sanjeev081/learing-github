package Com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.crm.qa.base.TestBase;

public class Homepage extends TestBase{
	
	
	@FindBy(xpath="//td[contains(text(),'User: AMARNATH AMARNATH')]")
	WebElement usernameLablel;
	
	@FindBy(xpath="//a[contains(text(),'Contacts')]")
	WebElement contactlink;
	
	@FindBy(xpath="//a[contains(text(),'Deals')]")
	WebElement dealslink;
	
	@FindBy(xpath="//a[contains(text(),'Task')]")
	WebElement taskslink;
	
	public Homepage() {
		PageFactory.initElements(driver, this);
		
	}
	public String veryfyHomepageTitle() {
		return driver.getTitle();
	}
	public boolean verifycorrectusername() {
		return usernameLablel.isDisplayed();		
	}
	public Contactspage clickoncontactslink() {
		contactlink.click();
		return new Contactspage();
		
	}
	public Dealspage dealsslink() {
		dealslink.click();
		return new Dealspage();
		
	}
	public Taskspage Taskslink() {
		dealslink.click();
		return new Taskspage();
		
	}
	
	




}
