package practiceSel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class POMTest {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		POMClass pmc=new POMClass();
		
		PageFactory.initElements(driver, pmc);
		pmc.setUsername("anything@gmail.com");
		pmc.setPassword("passwors@123");
		pmc.clcikLogin();
		
//		Thread.sleep(2000);
//		pmc.setUsername("nothing@gmail.com");
//		pmc.setPassword("nothing");
//		pmc.clcikLogin();
	}

}
