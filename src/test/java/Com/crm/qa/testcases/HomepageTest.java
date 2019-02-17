package Com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Com.crm.qa.base.TestBase;
import Com.crm.qa.pages.Contactspage;
import Com.crm.qa.pages.Homepage;
import Com.crm.qa.pages.Loginpage;
import Com.crm.qa.utill.Testutil;

public class HomepageTest extends TestBase{
	Loginpage loginpage;
	Homepage homepage;
	Testutil testutil;
	Contactspage contactspage;

	
	public HomepageTest() {
		super();
	}
		
		@BeforeMethod
		public void  setup() {
			initialization();
			testutil=new Testutil();
			contactspage=new Contactspage();
			loginpage=new Loginpage();
			homepage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));		
		}
		
		@Test(priority=1)
		public void veryfyHomepageTitletest() {
			String homepageTitle=homepage.veryfyHomepageTitle();
			Assert.assertEquals(homepageTitle, "CRMPRO","Home page title not matched");
			
		}
		@Test(priority=2)
		public void veryfyusernametest() {
			testutil.switchToFrame();
			Assert.assertTrue(homepage.verifycorrectusername());
			
		}
		@Test(priority=3)
		public void veryfycontactslinktest() {
			testutil.switchToFrame();
			contactspage=homepage.clickoncontactslink();
			
		}
		
		@AfterMethod
		public void tearDown(){
			driver.quit();
			
		}
		




}
