package selecting_options_from_autocompleted_editbox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drag_and_drop 
{

	public static void main(String[] args) 
	{
		WebDriver driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
		driver.get("https://marcojakob.github.io/dart-dnd/basic/");
		driver.manage().window();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement doc1=driver.findElement(By.xpath("(//img[@class='document'])[1]"));
		WebElement doc2=driver.findElement(By.xpath("(//img[@class='document'])[2]"));
		WebElement doc3=driver.findElement(By.xpath("(//img[@class='document'])[3]"));
		WebElement doc4=driver.findElement(By.xpath("(//img[@class='document'])[4]"));
		WebElement trashbin=driver.findElement(By.xpath("//div[contains(@class,'trash')]"));
		
		Actions action=new Actions(driver);
		
		action.dragAndDrop(doc1, trashbin).perform();
		action.dragAndDrop(doc2, trashbin).perform();
		
		action.clickAndHold(doc3).moveToElement(trashbin).release().perform();
		action.clickAndHold(doc4).moveToElement(trashbin).release().build().perform();

	}

}
