package Pages.Facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Forgot_Password {
	public WebDriver driver;
	
@FindBy (id="identify_email")
WebElement forgotfield;
@FindBy (id ="u_0_5")
WebElement searchfield;
@FindBy (xpath = "(//*[text()='Find Your Account'])[2]")
WebElement text;
public Forgot_Password(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

public void forgotfieldinput(String email) {
	forgotfield.sendKeys(email);
}
public void searchfieldinput() {
	searchfield.click();
}
public WebElement textout() {
	return text;
	
}


}
