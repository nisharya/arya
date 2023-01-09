import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Wait_for_frame 
{

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		
		try
		{
			new WebDriverWait(driver, Duration.ofSeconds(100))
			.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("modalIframe"));
			System.out.println("frame loaded and applied switch");
			
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		
		

	}

}
