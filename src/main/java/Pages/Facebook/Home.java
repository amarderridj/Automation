package Pages.Facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
  public WebDriver driver;
  
	@FindBy(id ="email")
	WebElement email;
	@FindBy (id="pass")
	WebElement pass;
	@FindBy (xpath ="//*[text()='Log In']")
	WebElement sign;
	@FindBy(id="u_0_2")
	WebElement acc;
	@FindBy (linkText = "Forgot Password?")
	WebElement Forgot;
	
	public Home ( WebDriver driver){
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void emailinput(String Email) {
		
		email.sendKeys(Email);
	}
	public void passinput(String Pass) {
		pass.sendKeys(Pass);
	}
	public void signin() {
		
		//WebDriverWait it=new WebDriverWait(driver, 5);
		//it.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Log In']")));
		sign.click();
	}
	public void accin() {
		acc.click();
	}

	public void Forgotlink() {
		Forgot.click();
	}
}
