package ui_verifications;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Read_runtime_properties 
{

	public static void main(String[] args) throws Exception
	{
		// Verifying Double Seat fares Disabled on roundtrip selection

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		WebElement roundtrip=driver.findElement(By.xpath("//li[@data-cy='roundTrip']"));
		roundtrip.click();
		Thread.sleep(5000);
		
		String runtime_class=roundtrip.getAttribute("class");
		if (runtime_class.contains("selected"))
		{
			System.out.println("roundtrip is selected");
			
			WebElement doublefares=driver.findElement(By.xpath("//ul[@class='specialFareNew']/li[6]"));
			String doublefares_class=doublefares.getAttribute("class");
			if (doublefares_class.contains("isItemDisabled"))
			{
				System.out.println("testpass");
			}
			
			else
			{
				System.out.println("testfail");

			}
			System.out.println("roundtrip not slected");
		}
		
		
		
	}

}
