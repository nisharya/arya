package ui_verifications;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selecting_multiple_options 
{

	public static void main(String[] args) throws Exception 
	{
		WebDriver driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
		driver.get("https://near-me.hdfcbank.com/branch-atm-locator/?lat=17.3687993&long=78.5307417&shared=1");
		driver.manage().window();
		Thread.sleep(5000);
		
		WebElement stateDD=driver.findElement(By.xpath("//select[@id='customState']"));
		
		((JavascriptExecutor)driver).executeScript("arguments[0].setAttribute('multiple','multiple')", stateDD);
		Thread.sleep(5000);
		
		boolean flag=new Select(stateDD).isMultiple();
		System.out.println("dropdown is multiple type"+flag);
		
		if (flag)
		{
			System.out.println("dropdown is multiple selection type");
			new Select(stateDD).deselectAll();
			new Select(stateDD).selectByIndex(4);
			new Select(stateDD).selectByIndex(6);
			new Select(stateDD).selectByIndex(9);
			
			int selectioncount=new Select(stateDD).getAllSelectedOptions().size();
			 System.out.println("selectioncount is"+selectioncount);
			 
			 for (WebElement Eachoption  :new Select(stateDD).getAllSelectedOptions() )
			 {
				System.out.println(Eachoption.getText());
			 }
			 
		}
		
		else 
		{
			System.out.println("dropdown is single selection type");

		}
		
		
		
		 
	 
			
		 
		

	}

}
