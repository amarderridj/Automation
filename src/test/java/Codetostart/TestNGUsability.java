package Codetostart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.BeforeClass;
public class TestNGUsability {
	
	public WebDriver driver;

	
	
@Parameters({"browser","URI"})
@BeforeClass
  public void Driver(String browser, String URL) {
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "/home/kali/Downloads/chromedriver");
		    driver = new ChromeDriver();
			driver.get(URL);
			driver.manage().window().maximize();
			/*WebElement CreateAnaccount = driver.findElement(By.linkText("Create New Account"));
			boolean acc = CreateAnaccount.isDisplayed();
			System.out.println(acc);
			WebElement text=driver.findElement(By.xpath("//h2[contains(text(),'Connect with friends and the world around you on F')]"));
			String textheading=text.getText();
			System.out.println(textheading);*/
		}else if (browser.equalsIgnoreCase("Firefox")){
			System.setProperty("webdriver.gecko.driver", "/home/kali/eclipse-workspace/Trainingsession/Drivers/geckodriver");
		    driver = new FirefoxDriver();
			driver.get(URL);
			driver.manage().window().maximize();
			/*WebElement CreateAnaccount = driver.findElement(By.linkText("Create New Account"));
			boolean acc = CreateAnaccount.isDisplayed();
			System.out.println(acc);
			WebElement text=driver.findElement(By.xpath("//h2[contains(text(),'Connect with friends and the world around you on F')]"));
			
			String textheading=text.getText();
			System.out.println(textheading);*/
		}
		}
@AfterClass
public void afterclass() {
	//driver.close();
}
  
}
