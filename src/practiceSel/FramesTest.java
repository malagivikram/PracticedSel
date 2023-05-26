package practiceSel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/iframe");
		
		driver.switchTo().frame("mce_0_ifr");
		driver.findElement(By.id("tinymce")).sendKeys("Writing Something");
		
		driver.quit();
	}

}
