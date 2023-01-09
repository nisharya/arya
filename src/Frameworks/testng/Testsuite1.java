package Frameworks.testng;

import org.testng.Reporter;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Testsuite1 {
  @Test
  public void f1() {
	  System.out.println("f1 excecuted");
  }
  
  @Test
  public void f2() {
	  System.out.println("f2 excecuted");
  }
  
  @Test
  public void f3() {
	  Reporter.log("f3 executed", true);
  }
  
  @BeforeSuite
  public void beforesuite()
  {
	  System.out.println("config setup");
  }
}
