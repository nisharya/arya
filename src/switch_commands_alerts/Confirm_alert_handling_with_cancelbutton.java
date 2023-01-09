package switch_commands_alerts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Confirm_alert_handling_with_cancelbutton
{

	public static void main(String[] args) throws Exception 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement cancel_link_driver=driver.findElement(By.xpath("//a[@href='#CancelTab']"));
		cancel_link_driver.click();
		Thread.sleep(3000);
		
		WebElement confirm_link=driver.findElement(By.xpath("//button[contains(.,'click the button to display a confirm box')]"));
		new Actions(driver).click(confirm_link).perform();
		Thread.sleep(3000);
		
		String alert_text=driver.switchTo().alert().getText();
		System.out.println(alert_text);
		
		driver.switchTo().alert().dismiss();
		System.out.println("clicked at cancel tab");
	

	}

}
