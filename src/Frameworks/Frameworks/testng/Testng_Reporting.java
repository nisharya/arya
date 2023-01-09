package Frameworks.Frameworks.testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testng_Reporting {
  @Test
  public void f1() {
	  System.out.println("Browser is up");
  }
  @Test
  public void f2()
  {
	 Reporter.log("signin successful");
  }
  @Test
  public void f3()
  {
	  Reporter.log("Email is composed",true);
  }
  
}
