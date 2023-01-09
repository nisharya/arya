package findelements;




import org.junit.Assert;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Beforeclass_afterclassTest {
	private static WebDriver driver;
	

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().setSize(new Dimension(800, 558));
		
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		driver.quit();
	}

	@Test
	public void test() {
		driver.get("https://www.outlook.com/");
	  	Assert.assertEquals("Facebook – log in or sign up", driver.getTitle());
	}

}
