import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;

import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Check_brokenlinks
{
 static void main(String[] args) throws IOException
	{
		String homepage="https://www.instagram.com/";
		String url="";
		HttpURLConnection huc=null;
		int respcode=200;
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(homepage);
		WebElement footerarea=driver.findElement(By.xpath("(//div[contains(@class,'abcm')])[8]"));
		List<WebElement>links=footerarea.findElements(By.tagName("a"));
		Iterator<WebElement>it=links.iterator();
		
		while (it.hasNext())
		{
			url=it.next().getAttribute("href");
			System.out.println("url");
			
			if (url == null||url.isEmpty()) {
				System.out.println("empty");
				continue;
				}
			
			if (!url.startsWith(homepage)) {
				System.out.println("other domain skipping it");
				
			}
			
			try {
				huc=(HttpURLConnection)(new URL(url).openConnection());
				huc.setRequestMethod("head");
				huc.connect();
				respcode=huc.getResponseCode();
				
				if (respcode>=400) {
					System.out.println(url+"broken");
					
				} 
				else {
					System.out.println(url+"valid");

				}
				
			} catch (MalformedURLException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
			
		}
		
		
		
	}

}
