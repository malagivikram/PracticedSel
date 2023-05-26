package practiceSel;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNGPract {

	@Test(invocationCount = 5)
	public void inCount() {

		Reporter.log("InvocationCountTest", true);
	}

	@DataProvider
	public Object[][] getData() {

		Object[][] a = new Object[2][2];

		a[0][0] = "UNTest1";
		a[0][1] = "PWTest1";
		a[1][0] = "UNTest2";
		a[1][1] = "PWTest2";
		return a;
	}

	@Test(dataProvider = "getData")
	public void testMethod(String un, String pw) {

		Reporter.log(un + " " + pw, true);
	}

	@Test(priority = -1)
	public void priorityCheck2() {

		Reporter.log("priority2 is in negative it'll execute first as from Ascending order", true);
	}

	@Test(priority = -1)
	public void priorityCheck1() {

		Reporter.log("priority1 is in negative it'll execute first as from Ascending order", true);
	}
	
	//Assert Example
	@Test
	public void testAsserts() {
		
		Reporter.log("Logging into Website",true);
		
		String ER="LoginPageTest";
		String AR="LogoutPage";
		
		Assert.assertEquals(AR, ER);
		
		Reporter.log("Logging out even after failing test case",true);//DOesn't execute
	}
	
	@Test
	public void testSoftAssert() {
		Reporter.log("Logging into Website",true);
		
		String ER="LoginPageTest";
		String AR="LogoutPage";
		
		SoftAssert softAssert = new SoftAssert();
		
		softAssert.assertEquals(AR, ER);
		
		Reporter.log("Logging out even after failing test case",true);
	}
	
}
