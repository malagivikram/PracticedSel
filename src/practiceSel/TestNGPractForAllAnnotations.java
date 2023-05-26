package practiceSel;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGPractForAllAnnotations {

	@BeforeSuite
	public void beforeSuite() {

		Reporter.log("Executes 1st" + " BeforeSuite", true);
	}

	@BeforeTest
	public void beforeTest() {

		Reporter.log("Executes before test" + " BeforeTest", true);
	}

	@BeforeClass
	public void beforeClass() {

		Reporter.log("Executes before Class" + " BeforeClass", true);
	}

	@BeforeMethod
	public void beforeMethod() {

		Reporter.log("Executes before TestMethod" + " BeforeMethod", true);
	}

	@Test
	public void testMethod() {

		Reporter.log("This is actual Test Method in the sense Test Case", true);
	}

	@AfterMethod
	public void afterMethod() {

		Reporter.log("Executes after TestMethod" + " AfterMethod", true);
	}

	@AfterClass
	public void afterClass() {

		Reporter.log("Executes after Class" + " AfterClass", true);
	}

	@AfterTest
	public void afterTest() {

		Reporter.log("Executes after Test" + " AfterTest", true);
	}

	@AfterSuite
	public void afterSuite() {

		Reporter.log("Executes Last" + " AfterSuite", true);
	}
}
