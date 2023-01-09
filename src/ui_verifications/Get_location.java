package ui_verifications;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Get_location 
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://outlook.live.com/owa/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		WebElement signin=driver.findElement(By.xpath("(//a[contains(.,'Sign in')])[1]"));
		
		int obj_ycord=signin.getLocation().getY();
		System.out.println("object presented at y"+obj_ycord);
		
		int window_height=driver.manage().window().getSize().getHeight();
		if (obj_ycord > window_height/2)
		{
			System.out.println("obj on top");
			
		} 
		else
		{
			System.out.println("obj on bottom");

		}
		if (signin.getLocation().getY() > 0)
		{
			System.out.println("visible");
		} 
		else
		{
			System.out.println("hidden");

		}
				
	}

}
