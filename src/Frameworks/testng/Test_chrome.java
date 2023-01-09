package Frameworks.testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Test_chrome {
  @Test
  public void login() {
	  System.out.println("login succesful");
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("test before chrome");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("test after launch");
  }

}
