package robot_window_automation;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class Typetext_notepad
{
	public static void main(String[] args) throws IOException, Exception 
	{
		
		Runtime.getRuntime().exec("notepad.exe");
		Thread.sleep(5000);
		Robot robot=new Robot();
		robot.setAutoDelay(200);
		
		robot.keyPress(KeyEvent.VK_H);
		robot.keyPress(KeyEvent.VK_A);
		robot.keyPress(KeyEvent.VK_I);
		


		
		
	}

}
