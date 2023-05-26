package practiceSel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class POMClass {

	@FindBy(id="email")
	private WebElement unTB;
	
	@FindBy(name="pass")
	private WebElement pwTB;
	
	@FindBy(name="login")
	private WebElement loginBTN;
	
	public void setUsername(String un) {
		unTB.sendKeys(un);
	}
	public void setPassword(String pw) {
		pwTB.sendKeys(pw);
	}
	public void clcikLogin() {
		loginBTN.click();;
	}
	
}
