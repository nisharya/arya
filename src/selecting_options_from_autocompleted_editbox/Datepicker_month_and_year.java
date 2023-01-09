package selecting_options_from_autocompleted_editbox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Datepicker_month_and_year 
{

	public static void main(String[] args)
	{
		WebDriver driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
		driver.get("https://jqueryui.com/resources/demos/datepicker/dropdown-month-year.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.id("datepicker")).click();
		
		new Select(driver.findElement(By.xpath("//select[@aria-label='Select month']"))).selectByVisibleText("Mar");
		new Select(driver.findElement(By.xpath("//select[@aria-label='Select year']"))).selectByValue("2017");
		driver.findElement(By.linkText("21")).click();
				

	}

}
