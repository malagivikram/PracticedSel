package practiceSel;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionsClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		driver.get("https://duckduckgo.com/");
		System.out.println(driver.findElement(By.xpath("//input[@id='searchbox_input']")).getAttribute("placeholder"));
		
		
		//		
////		driver.get("https://www.decathlon.in/")
//
//		driver.navigate().to("https://www.decathlon.in/");
//
//		driver.manage().window().maximize();
//		
//		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
//		
//		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//h2[text()='LOCATION']"))));
//		
//
//		if (driver.findElement(By.xpath("//h2[text()='LOCATION']")).isDisplayed()) {
//
//			//driver.findElement(By.cssSelector("button[type='submit']")).click();
//			
//			//driver.findElement(By.cssSelector("button[type='submit']")).sendKeys(Keys.ENTER);
//			
//			driver.findElement(By.cssSelector("button[type='submit']")).submit();
//		}
////		driver.navigate().back();
////
////		driver.navigate().forward();
//		Thread.sleep(5000);		
//		Actions action = new Actions(driver);
//		WebElement web = driver.findElement(By.xpath("//span[contains(text(),'PRICE DROP')]"));
//		
////		action.moveToElement(web).perform();
//		action.doubleClick(web).perform();
//		
//		
		
//		driver.navigate().to("https://www.amazon.in/");
//		driver.manage().window().maximize();
//		Thread.sleep(5000);	
//		List<WebElement> list=driver.findElements(By.cssSelector(".a-price-whole"));
//		
//		for(int i=0;i<list.size();i++) {
//			
//			String text=list.get(i).getText().replaceAll("[^0-9]", "");
//			
//			
//			int foo = Integer.parseInt(text);
//			System.out.println(foo);
//		}
//		
		
		
		
//		driver.quit();
	}

}
