package Frameworks.testng;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



public class Get_parameters_from_suite {
	
	public WebDriver driver;
	
	
  @Test(priority=0)
  @Parameters("browser_name")
  public void launch_browser(String browsername)
  {
	switch (browsername)
	{
	case "chrome":
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		Reporter.log("chrome lanched");
		break;
		
	case "ie":
		WebDriverManager.iedriver().setup();
		driver=new InternetExplorerDriver();
		Reporter.log("ie lanched");
		break;

	default:System.out.println("browser matched");
		break;
	}  
  }
  
  @Test(priority=1)
  @Parameters("appurl")
  public void loadwebpage(String url) 
  {
	  driver.get(url);
	  Reporter.log("application loaded");
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  Reporter.log("wait assigned");
  }
  
  @Test(priority=2)
  @Parameters({"id","pd"})
  public void login(String uid,String pwd)
  {
	  WebElement emailid=driver.findElement(By.id("email"));
	  emailid.clear();
	  emailid.sendKeys(uid);
	  Reporter.log("email entered");
	  
	  WebElement pswd=driver.findElement(By.id("pass"));
	  pswd.clear();
	  pswd.sendKeys(pwd);
	  Reporter.log("pswd entered");
  }
}
