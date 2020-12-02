package Pages.Facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.w3c.dom.Attr;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.TypeInfo;
import org.w3c.dom.UserDataHandler;
import org.w3c.dom.html.HTMLBaseElement;

public class CreateNewAccount {
	public WebDriver driver;
	
	@FindBy (name = "birthday_month")
	WebElement mm;
	@FindBy (name ="birthday_day")
	WebElement dd;
	@FindBy(name ="birthday_year")
	WebElement yy;
	
	public CreateNewAccount(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);		
	}

	public void mminput() {
		WebDriverWait it= new WebDriverWait(driver, 5);
		it.until(ExpectedConditions.visibilityOfElementLocated(By.name("birthday_month")));
		Select birthmm=new Select(mm);
		birthmm.selectByValue("5");
		}
	public void ddinput() {
		Select birthdd=new Select(dd);
		birthdd.selectByValue("19");
	}
	public void yyinput() {
		Select birthyy=new  Select(yy);
		birthyy.selectByValue("1992");
			
		}
			
				
		

}
