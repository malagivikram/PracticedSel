package practiceSel;

import java.io.File;
import java.time.Duration;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import javax.swing.text.Document;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DecathlonLoginTest {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		
//		driver.get("https://www.decathlon.in/")

		driver.navigate().to("https://www.decathlon.in/");

		driver.manage().window().maximize();
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//h2[text()='LOCATION']"))));
		

		if (driver.findElement(By.xpath("//h2[text()='LOCATION']")).isDisplayed()) {

			//driver.findElement(By.cssSelector("button[type='submit']")).click();
			
			//driver.findElement(By.cssSelector("button[type='submit']")).sendKeys(Keys.ENTER);
			
			driver.findElement(By.cssSelector("button[type='submit']")).submit();
		}
		driver.navigate().back();

		driver.navigate().forward();



		System.out.println(driver.getTitle());
		
		WebElement dr=driver.findElement(By.xpath("//input[@type='search']"));
		
		dr.sendKeys("anything");
		
		System.out.println(dr.getAttribute("value"));
		System.out.println(dr.getLocation());
		System.out.println(dr.getSize());

		
//		System.out.println(dr.getCssValue("value"));
		

//		driver.findElement(By.xpath("//input[@type='search']")).sendKeys(Keys.ENTER);
		
//		Clear the text field
		
		dr.sendKeys(Keys.CONTROL+"a");
		dr.sendKeys(Keys.DELETE);
	
		driver.navigate().refresh();
		
		
		
		
		//Save the screenshot using date
//		Date d=new Date();
//		System.out.println(d);
//		String s=d.toString().replaceAll(":", "-");
//		
//		File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(srcFile, new File("./screenShots/"+s+".png"));

		driver.manage().timeouts().pageLoadTimeout(3,TimeUnit.SECONDS);
       
		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(0,1000)");
		
		Thread.sleep(1000);

		
		
//		driver.findElement(By.xpath("//h2[text()='For The Love Of Outdoors']")).click();
//		
//		js.executeScript("arguments[0].scrollIntoView(true)", xp);
		
		
		String s= "document.getElementById('search').value='EnterSomethingElse'";
		js.executeScript(s);
		
		
		
		Thread.sleep(2000);
		driver.quit();

	}

}
