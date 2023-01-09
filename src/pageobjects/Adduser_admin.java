package pageobjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adduser_admin
{
	
	WebDriver driver;
	public Adduser_admin(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	@FindBy(xpath = "(//div[contains(@tabindex,'0')])[1]")
	public WebElement  Select1;

	@FindBy(xpath = "//input[@placeholder='Type for hints...']")
	public WebElement  hints;

	@FindBy(xpath = "(//div[@tabindex='0'])[2]")
	public WebElement  Select;

	@FindBy(xpath = "(//input[@autocomplete='off'])[1]")
	public WebElement username;

	@FindBy(xpath = "(//input[@type='password'])[1]")
	public WebElement  password;
	
	@FindBy(xpath = "(//input[@type='password'])[2]")
	public WebElement  confirm_password;

	@FindBy(xpath = "//button[@type='submit']")
	public WebElement  save;

	@FindBy(xpath = "//button[contains(.,'Cancel')]")
	public WebElement  cancel;
	
	public void typeusername(String uid)
	{
		username.sendKeys(uid);
	}
	public void typepassword(String pwd) 
	{
		password.sendKeys(pwd);
	}
	public void retypepassword(String retyppwd)
	{
		confirm_password.sendKeys(retyppwd);
	}
	

}
