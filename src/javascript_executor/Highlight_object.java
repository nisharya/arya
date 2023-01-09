package javascript_executor;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Highlight_object 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js=((JavascriptExecutor)driver);
		Thread.sleep(4000);
		
		WebElement Createbutton=driver.findElement(By.xpath("//a[contains(.,'Create New Account')]"));
		js.executeScript("arguments[0].style.outline='2px solid red'", Createbutton);
		
		WebElement forgotlink=driver.findElement(By.linkText("Forgotten password?"));
		js.executeScript("arguments[0].style.backgroundColor='yellow'", forgotlink);

	}

}
