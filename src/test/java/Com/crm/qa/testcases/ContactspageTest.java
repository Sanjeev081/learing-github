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

public class ContactspageTest extends TestBase{
	Loginpage loginpage;
	Homepage homepage;
	 Testutil  testutil;
	 Contactspage contactspage;
    public ContactspageTest() {
		super();
    }
    @BeforeMethod
	public void  setup() {
		initialization();
		testutil=new Testutil();
		contactspage=new Contactspage();
		loginpage=new Loginpage();
		homepage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		testutil.switchToFrame();
	}
    @Test
    public void veryfycontactslabel() {
    	Assert.assertTrue(contactspage.veryfyConatactsLabel(),"contact label is the missingon the page");
    	
    }
    
    
    
    
    
    
    
    @AfterMethod
	public void tearDown(){
		driver.quit();
		
	}



}
