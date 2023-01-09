package browser_launch;

import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Edgebrowser 
{

	public static void main(String[] args) 
	{
		WebDriverManager.edgedriver().setup();
		EdgeDriver edgebrowser=new EdgeDriver();
		edgebrowser.get("http://instagram.com");
		System.out.println(edgebrowser.getTitle());
		edgebrowser.close();
	}

}
