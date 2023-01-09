package switch_commands_alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Check_background_colour 
{

	public static void main(String[] args) throws Exception
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://instagram.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		WebElement login_button=driver.findElement(By.xpath("(//button[contains(.,'Log in')])[1]"));
		String RGBA_bgcolor=login_button.getCssValue("background-color");
		System.out.println(RGBA_bgcolor);
		
		String hexcolourcode="#0095f7";
		
		Color objcolor=Color.fromString(RGBA_bgcolor);
		if (objcolor.asHex().equals(hexcolourcode))
		{
			System.out.println("matching");
			
		}
		else
		{
			System.out.println("mismatched");

		}
		
		

	}

}
