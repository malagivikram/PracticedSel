package practiceSel;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
	
public class HandleWins {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String parentWin=driver.getWindowHandle();
		
		System.out.println("Title of Parent Window is "+" : "+driver.getTitle());
		
		WebElement element1=driver.findElement(By.xpath("/html/body/footer/section/div[2]/div/div/div[1]/div/ul/li[1]/a"));
		WebElement element2=driver.findElement(By.xpath("/html/body/footer/section/div[2]/div/div/div[1]/div/ul/li[2]/a"));
		WebElement element3=driver.findElement(By.xpath("/html/body/footer/section/div[2]/div/div/div[1]/div/ul/li[3]/a"));
		WebElement element4=driver.findElement(By.xpath("/html/body/footer/section/div[2]/div/div/div[1]/div/ul/li[4]/a"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].click();", element1);
		js.executeScript("arguments[0].click();", element2);
		js.executeScript("arguments[0].click();", element3);
		js.executeScript("arguments[0].click();", element4);
		
		
		Set<String> wins=driver.getWindowHandles();
		
		Iterator<String> it=wins.iterator();
		
		while(it.hasNext()) {
			
			String childWins=it.next();
			
			if(!parentWin.equals(childWins)) {
				driver.switchTo().window(childWins);
				System.out.println("Title of Child Window is "+" : "+driver.getTitle());
				driver.close();
			}
		}
		
		driver.quit();

	}
}
