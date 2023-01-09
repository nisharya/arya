import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Group_links
{


	public static void main(String[] args) throws Exception
	{
		WebDriver driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		
		WebElement trendingtabs=driver.findElement(By.id("trending-naukri-wdgt"));
		List<WebElement> alllinks=trendingtabs.findElements(By.className("ntc__chip-wrapper"));
		 for (int i = 0; i < alllinks.size(); i++) 
		 {
			WebElement Eachlink=alllinks.get(i);
			
			String LinkName=Eachlink.getText();
			String linkhref=Eachlink.getAttribute("href");
			//System.out.println(linkname+""+linkhref);
			
			String mainwindowid=driver.getWindowHandle();
			Eachlink.click();
			Thread.sleep(5000);
			
			
			for (String eachwindowid : driver.getWindowHandles()) 
			{
				if (!eachwindowid.equals(mainwindowid)) 
				{
					driver.switchTo().window(eachwindowid);
					if (driver.getCurrentUrl().contains(linkhref)) 
					{
						System.out.println(LinkName+"  "+"matched");
					}
					else 
					{
						System.out.println(LinkName+"  "+"mismatched");

					}
					driver.close();
					break;
				} 
				
			}
			driver.switchTo().window(mainwindowid);
			
		 }
		 Thread.sleep(5000);
		 
	}

}
