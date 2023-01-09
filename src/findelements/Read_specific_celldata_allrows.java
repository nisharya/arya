package findelements;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Read_specific_celldata_allrows
{

	public static void main(String[] args) throws Exception 
	{
		WebDriver driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
		driver.get("https://in.investing.com/equities/icici-bank-ltd-historical-data");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(4000);
		
		WebElement table=driver.findElement(By.xpath("//table[@class='common-table medium js-table']"));
		List<WebElement>rows=table.findElements(By.tagName("tr"));
		rows.remove(0);
		
		for (int i = 0; i < rows.size(); i++) 
		{
			
			WebElement selectedrows=rows.get(i);
			List<WebElement>cells=selectedrows.findElements(By.tagName("td"));
			
			String date=cells.get(0).getText();
			String highprice=cells.get(3).getText();
			System.out.println(date+ "" + highprice);
			
			
		}
		
		

	}

}
