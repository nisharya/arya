
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Finding_dynamicrow_usingrecordname
{

	public static void main(String[] args) throws Exception
	{
		WebDriver driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
		driver.get("https://www.icicidirect.com/equity/sector-overview");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(4000);
		
		WebElement table=driver.findElement(By.xpath("//table[@id='tbl_sector0']"));
		List<WebElement>rows=table.findElements(By.tagName("tr"));
		rows.remove(0);
		
		for (int i = 0; i < rows.size(); i++)
		{
			WebElement selectedrow=rows.get(i);
			String rowtext=selectedrow.getText();
			
			if (rowtext.contains("State Bank of India"))
			{
				System.out.println("today share position"+(i+1));
				List<WebElement>cells=selectedrow.findElements(By.tagName("td"));
				
				String sharename=cells.get(0).getText();
				String marketcapital=cells.get(1).getText();
				String ltpprice=cells.get(2).getText();
				System.out.println(sharename+""+marketcapital+""+ltpprice);
				
				String price=ltpprice.substring(0, 3);
				System.out.println("price");
				
				int priceinnum=Integer.parseInt(price);
				boolean pricerenage=false;
				while (pricerenage!=true)
				{
					if (priceinnum>600 || priceinnum<=610) 
					{
						cells.get(0).findElement(By.tagName("a")).click();
						Thread.sleep(3000);
						WebElement buy=driver.findElement(By.xpath("(//a[contains(.,'BUY')])[1]"));
						buy.click();
						pricerenage=true;
						break;
					}
					
				}
			}
		}
		
		

	}

}
