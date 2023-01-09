package ui_verifications;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Verifytext_presented_atlocation 
{

	public static void main(String[] args) throws Exception
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://outlook.com");
		driver.manage().window().maximize();
		
		WebElement signin=driver.findElement(By.xpath("(//a[contains(.,'Sign in')])[1]"));
		signin.click();
		
		WebElement nextbtn=driver.findElement(By.xpath("//input[@id='idSIButton9']"));
		nextbtn.click();
		Thread.sleep(5000);
		
		WebElement errmsg=driver.findElement(By.xpath("//div[@id='usernameError']"));
		String errtext=errmsg.getText();
		
		String exp_errtext="Enter a valid email address, phone number, or Skype name.";
		if (!errtext.isEmpty())
		{
			System.out.println("error text contains");
			if (exp_errtext.equals(errtext)) 
			{
				System.out.println("expected displayed");
				
			}
			else
				
			{
				System.out.println("not displayed");

			}
			
		}
		else
		{
			System.out.println("location doesnt contain text");

		}
		Thread.sleep(5000);
		driver.close();
		

		
	

	}

}
