package ui_verifications;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Get_placeholder_text 
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		WebElement Email=driver.findElement(By.id("email"));
		String email_placeholder=Email.getAttribute("placeholder");
		if (email_placeholder.equals("Email address or phone number")) 
		{
			System.out.println("placeholder text available");
		}
		else
		{
			System.out.println("placeholder text unavailable");
		}

	}

}
