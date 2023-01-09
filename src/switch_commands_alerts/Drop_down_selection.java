package switch_commands_alerts;



import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drop_down_selection 
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
		driver.get("https://facebook.com/reg");
		driver.manage().window();
		
		WebElement month_dd=driver.findElement(By.name("birthday_month"));
	
		List<WebElement>monthoption=month_dd.findElements(By.tagName("option"));
		System.out.println("total month"+monthoption.size());
		
		
		if (monthoption.size()>0)
		{
			for (int i = 0; i < monthoption.size(); i++)
			{
				WebElement eachobj=monthoption.get(i);
				System.out.println(eachobj.getText());
				eachobj.click();
				Thread.sleep(400);
			}
		} 
			else 
			{
				System.out.println("month not found");

		    }
		    WebElement year_dd=driver.findElement(By.name("birthday_year"));
		    List<WebElement>yearoptions=new Select(year_dd).getOptions();
		    
		    
		    if (yearoptions.size()>0) 
		    {
				for (WebElement eachoption : yearoptions) 
				{
					System.out.println(eachoption.getText());
					eachoption.click();
					Thread.sleep(400);
				}
				
			}
		    
		    else
		    {
		    	System.out.println("year option not found");

			}
		
		

	}

}
