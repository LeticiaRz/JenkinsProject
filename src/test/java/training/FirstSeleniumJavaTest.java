package training;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;	
import org.testng.annotations.AfterTest;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstSeleniumJavaTest {

	private WebDriver driver;		
	@Test				
	public void testEasy() {

		driver.get("https://testautomationu.applitools.com/"); 
		driver.manage().window().maximize();

		String title = driver.getTitle();
		AssertJUnit.assertEquals("Test Automation University | Applitools", title);
	}	

	@Test				
	public void testTwo() {	

		driver.get("https://www.google.co.uk/"); 
		driver.manage().window().maximize();

		String title1 = driver.getTitle();
		System.out.println("title is "+title1);
		AssertJUnit.assertEquals("Google", title1);

	}	

	@BeforeTest
	public void beforeTest() {
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();  
	}

	@AfterTest
	public void afterTest() {
		driver.quit();			
	}	
}
