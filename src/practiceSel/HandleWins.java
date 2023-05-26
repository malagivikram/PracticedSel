package practiceSel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWins {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/");
		
		driver.findElement(By.xpath("//a[@href='https://www.orangehrm.com/company/about-us/about-orangehrm']")).click();
		driver.findElement(By.xpath("/html/body/footer/section/div[2]/div/div/div[1]/div/ul/li[2]/a")).click();
		driver.findElement(By.xpath("/html/body/footer/section/div[2]/div/div/div[1]/div/ul/li[3]/a")).click();
		driver.findElement(By.xpath("/html/body/footer/section/div[2]/div/div/div[1]/div/ul/li[4]/a")).click();
	}
}
