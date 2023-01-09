package wait_commands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Waitfor_no_ofwindows
{

	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		
		WebElement instagram_link=driver.findElement(By.linkText("Instagram"));
		instagram_link.click();
		
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		
		try
		{
			wait.until(ExpectedConditions.numberOfWindowsToBe(3));
			System.out.println("3rd window opened");
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
