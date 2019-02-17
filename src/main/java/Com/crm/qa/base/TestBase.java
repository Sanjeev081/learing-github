package Com.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import Com.crm.qa.utill.Testutil;

public class TestBase {
	public static  WebDriver driver;
	  protected static Properties prop;
	
	public TestBase() {
		try {
			prop=new Properties();
			FileInputStream ip=new FileInputStream("C:\\Users\\Laptop\\eclipse-workspace\\FreeCrmTest\\src\\main\\java\\Com\\crm\\qa\\config\\Config.properties");
			prop.load(ip);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
			
	}
		
	}
	public static void initialization() {
		String browsername=prop.getProperty("browser");
		if(browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Laptop\\Downloads\\chromedriver_win32\\chromedriver.exe");
			 driver=new ChromeDriver();
			
		}else if(browsername.equals("FF")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Laptop\\Downloads\\geckodriver_win32\\chromedriver.exe");
			WebDriver driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Testutil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Testutil.IMPLLICIT_WAIT, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		
		
		
	}

}
