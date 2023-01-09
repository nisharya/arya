package browser_launch;

import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webdrivermanager_5
{

	public static void main(String[] args) 
	{
			WebDriver driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
			driver.get("http://naukri.com");
		

	}

}
