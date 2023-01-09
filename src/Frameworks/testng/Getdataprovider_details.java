package Frameworks.testng;

import org.testng.annotations.Test;

public class Getdataprovider_details {
	
  @Test(dataProvider="dp",dataProviderClass=Inputdata1.class)
  public void info(String name,String mobile) {
  }
}
