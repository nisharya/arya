package browser_launch;

import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Iebrowser 
{

	public static void main(String[] args) 
	{
		WebDriverManager.iedriver().setup();
		InternetExplorerDriver ieDriver=new InternetExplorerDriver();
		ieDriver.get("http://msn.com");
		System.out.println(ieDriver.getTitle());
		ieDriver.close();

	}

}
