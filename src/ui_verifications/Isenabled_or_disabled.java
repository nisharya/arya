package ui_verifications;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Isenabled_or_disabled 
{

	public static void main(String[] args) throws Exception
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();  	
		driver.get("https://www.instagram.com/accounts/emailsignup/");  
		driver.manage().window().maximize();  
		Thread.sleep(4000);
		
		WebElement signup=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/main[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[7]"
				+ "/div[1]/button[1]"));
		if (!signup.isEnabled())
		{
				System.out.println("disabled");	
				} 
		else
		{
			System.out.println("enabled");

				}
		
		
		
		

	}

}
