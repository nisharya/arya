package Frameworks.testng;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.lang.reflect.Method;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class Webdriver_testcase {
	
	WebDriver driver;
	String url="http://facebook.com";
	
  @Test
  public void verify_signup() {
	  driver.findElement(By.xpath("//a[contains(.,'Sign Up')]")).click();
	  String exp="Sign up for Facebook | Facebook";
	  Assert.assertEquals(driver.getTitle(), exp);
	  Reporter.log("title displayed"+driver.getTitle());
  }
  @BeforeMethod
  public void beforeMethod() {
	  driver.get(url);
  }

  @AfterMethod
  public void afterMethod(Method testmethod) throws Exception {
	  File src_file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileHandler.copy(src_file, new File("screens\\"+testmethod.getName()+".png"));
  }

  @BeforeClass
  public void beforeClass() {
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
  }

  @AfterClass
  public void afterClass() throws Exception {
	  Thread.sleep(5000);
	  driver.close();
  }

}
