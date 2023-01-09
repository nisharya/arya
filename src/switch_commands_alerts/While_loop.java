package switch_commands_alerts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class While_loop
{

	public static void main(String[] args) throws Exception 
	{
		int i=1;
		while (i<=10) 
		{
			System.out.println(i);
			i=i+1;
		}	
			int j=10;
			while (j>0)
			{
				System.out.println(j);
				j=j-1;	
			}
		
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.get("http://facebook.com/reg");
			driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("nishu@gmail.com");
			WebElement retypeemail=driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));

			boolean displaystatus=false;
			int count=0;
			while (displaystatus==true)
			{ 
				try {
					displaystatus=new WebDriverWait(driver, Duration.ofSeconds(20))
							.until(ExpectedConditions.visibilityOf(retypeemail)).isDisplayed();
					System.out.println("element present");
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				count=count+1;
				if (count==3) 
				{
					throw new Exception("element not visible");
				}
			}
			
	}

}
