package practise;

import org.testng.annotations.Test;

public class Parameters {
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
		  
		  WebElement pswd=driver.findElement(By.id("pwd"));
		  pswd.clear();
		  pswd.sendKeys(pwd);
		  Reporter.log("pswd entered");
		  
	  }
}