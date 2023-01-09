package Frameworks.Frameworks.testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class class1 {
  @Test
  public void f() {
	  Reporter.log("tc001 executed");
	  
  }
  @Test
  public void tc002()
  
  {
	  Reporter.log("tc002 executed");
  }
  @Test
  public void tc003()
  {
		Reporter.log("tcoo3 executed");

  }
}
