package switch_commands_alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert_with_ok_button 
{

	public static void main(String[] args) throws Exception 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		WebElement alert_prompt_link=driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		alert_prompt_link.click();
		Thread.sleep(3000);
		
		String alertmsg=driver.switchTo().alert().getText();
		System.out.println(alertmsg);

		driver.switchTo().alert().accept();
		WebElement cancel=driver.findElement(By.xpath("//a[@href='#CancelTab']"));
		cancel.click();
		System.out.println("link is clicked");
	}

}
