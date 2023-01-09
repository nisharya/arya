package findelements;


import java.io.File;
import java.time.Duration;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webdriver_testcases 
{
	static WebDriver driver;
	static WebDriverWait wait;
	String url="http://facebook.com";
	public @Rule TestName test=new TestName();
	
	

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		wait=new WebDriverWait(driver, Duration.ofSeconds(20));
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		Thread.sleep(3000);
		driver.close();
	}

	@Before
	public void setUp() throws Exception {
		driver.get(url);
	}

	@After
	public void tearDown() throws Exception {
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.createDir(new File("newscreens"));
		String Testname=test.getMethodName();
		FileHandler.copy(src, new File("newscreens\\"+Testname+".png"));
		
		
		
	}

	@Test
	public void test() 
	{
		driver.findElement(By.xpath("(//a[contains(.,'Sign Up')])[1]")).click();
		Assert.assertEquals("Sign up for Facebook | Facebook", driver.getTitle());

	
	}


}
