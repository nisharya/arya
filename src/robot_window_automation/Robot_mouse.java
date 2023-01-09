package robot_window_automation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.io.IOException;

public class Robot_mouse 
{

	public static void main(String[] args) throws AWTException, InterruptedException, IOException
	{
		Runtime.getRuntime().exec("notepad.exe");
		Thread.sleep(4000);
		Robot robot=new Robot();
		robot.setAutoDelay(1000);
		robot.mouseMove(100, 200);
		robot.mousePress(InputEvent.BUTTON1_MASK);
		robot.mousePress(InputEvent.BUTTON2_MASK);
		robot.mousePress(InputEvent.BUTTON3_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_MASK);
		robot.mouseRelease(InputEvent.BUTTON2_MASK);
		robot.mouseRelease(InputEvent.BUTTON3_MASK);
		robot.mouseWheel(100);

	}

}
