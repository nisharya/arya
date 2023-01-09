package Frameworks.testng;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class Inputdata1 {
  @Test(dataProvider = "dp")
  public void userlogin(String name, String mobile) {
	  System.out.println(name+" "+mobile);
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] {"padma","12345678"  },
      new Object[] { "amdap","87654321" },
    };
  }
  @DataProvider
  public String[][] info() {
    String data[][]=
    	{
      {"padma","12345678"  },
       { "amdap","87654321" },
};
    return data;
  } 
  
  @Test(dataProvider="info")
  public void verifydetails(String name,String mobile)
  {
	  System.out.println(name+""+mobile);
  }
}
  
