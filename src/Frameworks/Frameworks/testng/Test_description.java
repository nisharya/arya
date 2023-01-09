package Frameworks.Frameworks.testng;

import org.testng.annotations.Test;

public class Test_description {
  @Test(priority=1,description="verifying login with vald data")
  public void tc001() {
  }
  
  @Test(priority=0,description="verifying login with invalid data")
  public void tc002() {
  }
}
