import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Restricted_monthanddate_inside_datepicker 
{

	public static void main(String[] args) throws Exception
	{
		WebDriver driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
		driver.get("https://www.cleartrip.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(6000);
		
		WebElement calender=driver.findElement(By.xpath("//div[@class='fs-4 fw-500 c-inherit flex flex-nowrap ml-4']"));
		calender.click();
		System.out.println("calender identifid");
		Thread.sleep(2000);
		
		By nextbutton=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/div[3]/div[1]/div[1]/div[2]/*");
		while (true)
		{


			String runtimeclass=driver.findElement(nextbutton).getAttribute("class");
			if (runtimeclass.contains("c-neutral-200"))
			{	
				break;
				
				
			}
			driver.findElement(nextbutton).click();
			Thread.sleep(4000);
			
		}
	driver.close();
	}

}
