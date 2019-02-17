package Com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Com.crm.qa.base.TestBase;
import Com.crm.qa.pages.Homepage;
import Com.crm.qa.pages.Loginpage;

public class LoginpageTest extends TestBase{
	Loginpage loginpage;
	Homepage homepage;
	public LoginpageTest() {
		super();
	}

	@BeforeMethod
	public void  setup() {
		initialization();
		loginpage=new Loginpage();
			
	}
	
	
	@Test(priority=1)
	public void loginpageTitletest() {
		String title=loginpage.validateloginpageTtitle();
		Assert.assertEquals(title, "#1 Free CRM software in the cloud for sales and service");
	}
	
	@Test(priority=2)
	public void crmlogoimageTest() {
		boolean flag=loginpage.validateCRMimage();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=3)
	public void loginTest() {
		homepage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
