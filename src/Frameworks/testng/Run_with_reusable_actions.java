package Frameworks.testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Run_with_reusable_actions {
  @Test
  @Parameters({"mybrowser","myurl"})
  public void setupbrrowser(String browser,String url) {
  }
}
