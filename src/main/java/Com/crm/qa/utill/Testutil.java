package Com.crm.qa.utill;

import Com.crm.qa.base.TestBase;

public class Testutil extends TestBase{
	
	public static long PAGE_LOAD_TIMEOUT=20;
	public static long IMPLLICIT_WAIT=10;
	
	public void switchToFrame() {
		driver.switchTo().frame("mainpanel");
	}

}
