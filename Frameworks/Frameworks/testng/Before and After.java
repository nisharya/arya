package Frameworks.Frameworks.testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;

public class Before and After {
  @Test
  public void tc001 
  {
	  Reporter.log("test1 executed",true);
  }
  @BeforeMethod
  public void beforeMethod() 
  {
	  System.out.println("precondition");
  }

  @AfterMethod
  public void afterMethod() 
  {
	  System.out.println("postcondition"+"\n");
  }
  
  @Test(enabled=false)
  public void tc002() {
	  Reporter.log("test2 executed"true);
  }
  
  @Test
  public void tc003()
  {
	  Reporter.log("test3 executed",true);
  }
 
 
	  


	  
	  
		  
		  
	  
	  
	
	  
 

}
