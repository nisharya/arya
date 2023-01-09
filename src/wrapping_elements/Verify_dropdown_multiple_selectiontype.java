package wrapping_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Verify_dropdown_multiple_selectiontype 
{

	public static void main(String[] args) throws Exception 
	{
		WebDriver driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
		driver.get("https://near-me.hdfcbank.com/branch-atm-locator/?lat=17.3687993&long=78.5307417&shared=");
		driver.manage().window();
		Thread.sleep(1000);
		
		WebElement StateDD=driver.findElement(By.xpath("//select[contains(@id,'customState')]"));
		boolean flag=new Select(StateDD).isMultiple();
		System.out.println("Dropdown Is multiple selection type ?"+flag);
		
		((JavascriptExecutor)driver)
		.executeScript("arguments[0].setAttribute('multiple','multiple')", StateDD);
		Thread.sleep(4000);
		
		boolean flag1=new Select(StateDD).isMultiple();
		System.out.println("Dropdown is multiple selection type"+flag1);
		
		if (flag1) 
		{
			System.out.println("dropdown is multiple selection type");
			new Select(StateDD).selectByIndex(1);
			new Select(StateDD).selectByIndex(3);
			new Select(StateDD).selectByIndex(5);
			new Select(StateDD).deselectAll();
			
			int SelectionCount=new Select(StateDD).getAllSelectedOptions().size();
			System.out.println("selection count is"+SelectionCount);
				
			
		}
		
		else 
		{
			System.out.println("Dropdown is single option selection type");
			
		}
		

	}

}
