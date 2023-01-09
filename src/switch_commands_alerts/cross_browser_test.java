package switch_commands_alerts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class cross_browser_test
{

	public static void main(String[] args) throws InterruptedException
	{
		String browsers[]= {"chrome","firefox"};
		WebDriver driver=null;
		
		for (int i = 0; i < browsers.length; i++) 
		{
			String eachbrowser = browsers[i];
			
			if (eachbrowser.equals("chrome"))
			{
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
			}
			else if (eachbrowser.equals("firefox")) 
			{
				WebDriverManager.edgedriver().setup();;
				driver=new EdgeDriver();
			}
			
			String footerlinks[][]=
				{
						{"Sign Up","Sign up for Facebook | Facebook"},
						{"Log in","Log in to Facebook"},
						{"Messenger","Messenger"},
						{"Facebook Lite","Facebook Lite APK for Android"},
						{"Watch","Facebook Watch | Facebook"},
						{"Places","Discover great places in every city | Facebook"},
						{"Games","Games"},
						
				};
			
			for (int j = 0; j < footerlinks.length; j++) 
			{
				driver.get("http://facebook.com");
				
				String linkname=footerlinks[j][0];
				String pagetitle=footerlinks[j][1];
				
				driver.findElement(By.linkText(linkname)).click();
				Thread.sleep(2000);
				
				WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
				if (wait.until(ExpectedConditions.titleIs(pagetitle)))
				{
					System.out.println(linkname+"" +"title verified");
				}
				else
				{
					System.out.println(linkname+"" +"title not verified");

				}
				
			}
		}
	}

}
