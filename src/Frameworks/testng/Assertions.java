package Frameworks.testng;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assertions {

@Test
  public void tc001() {
	  Assert.assertEquals("instagram", "instagram");
	  Reporter.log("instagram is verified");
  }
  
  @Test
  public void tc002() {
	  Assert.assertTrue(true);
	  Reporter.log("gmail is verified");
  }
}
