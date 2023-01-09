package wait_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Isselected_method
{

	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();  	
		driver.get("https://www.facebook.com/reg/");  
		driver.manage().window().maximize();
		
		WebElement custom_button=driver.findElement(By.xpath("//input[@value='-1']"));
		custom_button.click();
		
		if (custom_button.isSelected()) 
		{
			System.out.println("custom selected");
		} 
		else
		{
			System.out.println("custom not selected");

		}

	}

}
