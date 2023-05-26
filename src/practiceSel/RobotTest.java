package practiceSel;


import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;


public class RobotTest {

	public static void main(String[] args) throws IOException, Exception {

		Runtime.getRuntime().exec("notepad");
		
		Robot rob=new Robot();
		
		Thread.sleep(1000);
		
		rob.keyPress(KeyEvent.VK_A);
		
		int j=50;
		for(int i=1;i<=10;i++) {
			
			rob.mouseMove(j, 100);
			j=j+50;
			Thread.sleep(500);
		}
		
	}
	

}
