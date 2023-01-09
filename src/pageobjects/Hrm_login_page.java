package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Hrm_login_page
{
	WebDriver driver;
	public Hrm_login_page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;	
	}
	
	@FindBy(xpath = "//input[@name='username']")
	public WebElement username;
	
	@FindBy(xpath = "//input[@type='password']")
	public WebElement password;
	
	@FindBy(xpath = "//button[@type='submit']")
	public WebElement login;
	
	@FindBy(xpath = "//p[contains(.,'Forgot your password?')]")
	public WebElement forgotpassword;
	
	public void hrmlogin(String uid,String pwd)
	{
		username.sendKeys(uid);
		password.sendKeys(pwd);
		login.click();
		
	}
	
	public void verifytitle() 
	{
		if (driver.getTitle().contains("OrangeHRM"))
		{
			System.out.println("same");
		} 
		else {
			System.out.println("different");

		}
		
	}
}
