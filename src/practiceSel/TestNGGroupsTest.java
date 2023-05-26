package practiceSel;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGGroupsTest {

	@BeforeMethod(alwaysRun =true)
	public void login() {
		Reporter.log("Login",true);
	}
	@AfterMethod(alwaysRun =true)
	public void logout() {
		Reporter.log("Logout",true);
	}
	
	@Test(priority=1, groups= {"user", "smoke"})
	public void createUser() {
		Reporter.log("createUser",true);
	}
	@Test(priority=2, groups= "user",enabled=true)
	public void deleteUser() {
		Reporter.log("deleteUser",true);
	}
	@Test(priority=3, groups= {"project", "smoke"})
	public void createProject() {
		Reporter.log("createProject",true);
	}
	@Test(priority=4, groups= "project")
	public void deleteProject() {
		Reporter.log("deleteProject",true);
	}
	
}
