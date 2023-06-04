package practiceSel;


import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class RobotTest {

	public static void main(String[] args) throws IOException, Exception {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.orangehrm.com/");
		driver.manage().window().maximize();
		Robot rob=new Robot();
		
		rob.keyPress(KeyEvent.VK_CONTROL);
		rob.keyPress(KeyEvent.VK_MINUS);
		rob.keyRelease(KeyEvent.VK_CONTROL);
		rob.keyRelease(KeyEvent.VK_MINUS);
		
		rob.keyPress(KeyEvent.VK_CONTROL);
		rob.keyPress(KeyEvent.VK_ADD);
		rob.keyRelease(KeyEvent.VK_CONTROL);
		rob.keyRelease(KeyEvent.VK_EQUALS);
		
//		Runtime.getRuntime().exec("notepad");

//		Thread.sleep(1000);
//		
//		rob.keyPress(KeyEvent.VK_A);
//		
//		int j=50;
//		for(int i=1;i<=10;i++) {
//			
//			rob.mouseMove(j, 100);
//			j=j+50;
//			Thread.sleep(500);
//		}
//		
		
		
		
		
	}
	

}
