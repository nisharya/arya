package pageobjects;

import java.sql.Driver;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hrm_login_pageTest {
	WebDriver Driver;
	String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

	@Before
	public void setUp() throws Exception
	{
		WebDriverManager.chromedriver().setup();
		Driver=new ChromeDriver();
		Driver.manage().window().maximize();
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(10000);
		Driver.close();
	}

	@Test
	public void verifyloginpage() throws Exception 
	{
		Driver.get(url);
		Thread.sleep(4000);
		Hrm_login_page login=PageFactory.initElements(Driver,Hrm_login_page.class);
		login.username.sendKeys("Admin");
		login.password.sendKeys("admin123");
		
	}

}
