package Frameworks.Frameworks.testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class NewTest {
  @Test
  public void tc001() {
	  Reporter.log("test1 executed",true);
	  
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("precondition");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("postcondition");
  }

}
