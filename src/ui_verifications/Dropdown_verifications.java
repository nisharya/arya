package ui_verifications;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown_verifications 
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/reg");
		driver.manage().window().maximize();
		Thread.sleep(10000);  
		
		WebElement dob_month=driver.findElement(By.xpath("//select[contains(@id,'month')]"));
		//String month=new Select(dob_month).getFirstSelectedOption().getText();
		int count=new Select(dob_month).getOptions().size();
		//if (month.equals("sep"))
		if (count==11)
		
			
		
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");

		}
		

	}

}
