package PIIT_.Trainingsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox_Try extends Input{
	   static WebDriver driver;
	public static void main(String[] args) {
		
		String name =Input.input();
		Driver(name,"https://www.amazon.com");

		}
		public static void Driver(String browser, String URL) {
			if(browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "/home/kali/Downloads/chromedriver");
			    driver = new ChromeDriver();
				driver.get(URL);
				driver.manage().window().maximize();
				WebElement CreateAnaccount = driver.findElement(By.linkText("Create New Account"));
				boolean acc = CreateAnaccount.isDisplayed();
				System.out.println(acc);
				WebElement text=driver.findElement(By.xpath("//h2[contains(text(),'Connect with friends and the world around you on F')]"));
				String textheading=text.getText();
				System.out.println(textheading);
			}else if (browser.equalsIgnoreCase("Firefox")){
				System.setProperty("webdriver.gecko.driver", "/home/kali/eclipse-workspace/Trainingsession/Drivers/geckodriver");
			    driver = new FirefoxDriver();
				driver.get(URL);
				driver.manage().window().maximize();
				WebElement CreateAnaccount = driver.findElement(By.linkText("Create New Account"));
				boolean acc = CreateAnaccount.isDisplayed();
				System.out.println(acc);
				WebElement text=driver.findElement(By.xpath("//h2[contains(text(),'Connect with friends and the world around you on F')]"));
				
				String textheading=text.getText();
				System.out.println(textheading);
			}
		}
}
