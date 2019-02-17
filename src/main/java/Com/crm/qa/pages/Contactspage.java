package Com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.crm.qa.base.TestBase;

public class Contactspage extends TestBase{
	
	@FindBy(xpath="//td[contains(text(),'User: AMARNATH AMARNATH')]")
	WebElement ConatactsLabel;
	
	public Contactspage() {
		PageFactory.initElements(driver, this);
	}
	public boolean veryfyConatactsLabel() {
		return ConatactsLabel.isDisplayed();
		
	}

	

	

}
