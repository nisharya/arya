package Frameworks.testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Before_Method_And_AfterMethod {
	public void beforemethod() {
		System.out.println("precondition");
		}
	public void aftermethod() {
		System.out.println("postcondition");
		}

  @Test
  public void afterClassTest() {
    Reporter.log("test1 executed",true);
  }

  @Test(enabled=false)
  public void beforeClassTest() {
   Reporter.log("test2 executed",true);
  }
}

