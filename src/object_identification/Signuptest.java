package object_identification;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Signuptest 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//span[contains(.,'Sign up')]")).click();
		Thread.sleep(3000);
		
		
		
		
	    driver.findElement(By.name("emailOrPhone")).sendKeys("8686991145");
	  
		
		driver.findElement(By.name("fullName")).sendKeys("nishanth");
		
		driver.findElement(By.name("username")).sendKeys("ni.shanth7887");
		driver.findElement(By.name("password")).sendKeys("654123");
		driver.findElement(By.xpath("//button[contains(.,'Sign up')]")).click();
		 
		Thread.sleep(3000);
		driver.findElement(By.xpath("//select[contains(@title,'Month:'])")).sendKeys("september");
		driver.findElement(By.xpath("//select[contains(@title,'Day:'])")).sendKeys("12");
		driver.findElement(By.xpath("//select[contains(@title,'Year:')]")).sendKeys("2012");
		
		driver.findElement(By.xpath("//button[contains(.,'Next')]")).click();
		
		driver.close();
		
		System.out.println("task completed");
		
				
		
		
		

	}

}
