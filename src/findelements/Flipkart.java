package findelements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkart
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
		driver.get("https://www.flipkart.com/");
		driver.manage().window();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement searchbox = driver.findElement(By.xpath("//input[@type='text']"));
		searchbox.clear();
		searchbox.sendKeys("iphone13"+Keys.ENTER);
		
		By nextbutton=By.xpath("//span[contains(.,'Next')]");
		By productable=By.xpath("//div[@class='_1YokD2 _3Mn1Gg']");
		
		boolean visisble_status=false;
		do {
			List<WebElement>products=driver.findElement(productable)
					.findElements(By.xpath("(//div[@class='_1AtVbE col-12-12'])"));
			System.out.println(products.size());
			
			for (int i = 3; i < products.size()-4; i++)
			{
				WebElement eachproduct=products.get(i);
				String productname=eachproduct.findElement(By.className("_4rR01T")).getText();
				String productprice=eachproduct.findElement(By.xpath("(//div[@class='_30jeq3 _1_WHN1'])")).getText();
				System.out.println(productname+"  "+productprice);
				Thread.sleep(2000);
				
			}
				
				try {
					visisble_status=new WebDriverWait(driver, Duration.ofSeconds(5))
							.until(ExpectedConditions.invisibilityOfElementLocated(nextbutton));
					
					
				} catch (Exception e) 
				{
					driver.findElement(nextbutton).click();
					Thread.sleep(5000);
				
				
			}
			
			
		} while (visisble_status==false);

	}

}
