package Example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
	
	private WebDriver driver;		
	@Test				
	public void testEasy() {	

		driver.get("http://demo.guru99.com/selenium/guru99home/");  
		String title = driver.getTitle();				 
		Assert.assertTrue(title.contains("Demo Guru99 Page")); 		
	}	
	@BeforeTest
	public void beforeTest() {	
		String path=System.getProperty("user.dir");
		System.out.println(path);
		System.setProperty("webdriver.gecko.driver",path +  "/src/main/resources/geckodriver.exe");
	    driver = new FirefoxDriver();  
	}		
	@AfterTest
	public void afterTest() {
		driver.quit();			
	}		
}
