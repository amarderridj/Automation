package PIIT_.Trainingsession;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Pointer {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/kali/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		
		/*Actions its = new Actions(driver);
		its.moveToElement(driver.findElement(By.xpath("(//*[text()='Hello, Sign in'])[1]"))).build().perform();
		its.moveToElement(driver.findElement(By.xpath("(//*[text()='Sign in'])[1]"))).click().build().perform();
		its.moveToElement(driver.findElement(By.xpath("//input[@id='ap_email']"))).sendKeys("amar").build().perform();
		its.keyDown(driver.findElement(By.id("createAccountSubmit")), Keys.LEFT_SHIFT).click().build().perform();
		its.keyUp(Keys.LEFT_SHIFT).build().perform();*/
		
		Actions its=new Actions(driver);
		its.moveToElement(driver.findElement(By.xpath("(//*[text()='Hello, Sign in'])[1]"))).perform();
		
		driver.findElement(By.xpath("(//*[text()='Sign in'])[1]")).click();
		//its.moveToElement(driver.findElement(By.xpath("(//*[text()='Sign in'])[1]"))).click().perform();
		
		driver.findElement(By.id("ap_email")).sendKeys("amar");
		//its.moveToElement(driver.findElement(By.id("ap_email"))).sendKeys("amar").perform();
		
		its.moveToElement(driver.findElement(By.id("createAccountSubmit"))).keyDown(Keys.LEFT_SHIFT).click().perform();
		
		//its.keyDown(driver.findElement(By.id("createAccountSubmit")),Keys.LEFT_SHIFT).click().perform();
		//its.keyUp(Keys.LEFT_SHIFT).perform();
		
		String parentwindowhandle = driver.getWindowHandle();
		System.out.println(parentwindowhandle);
		
		Set<String> multiplewindows = driver.getWindowHandles();
		for (String window : multiplewindows) {
			if(window.equalsIgnoreCase(parentwindowhandle)) {
				System.out.println("this is Switch");
			}else {driver.switchTo().window(window);}
			
		}
		
		driver.findElement(By.xpath("//input[@id='ap_customer_name']")).sendKeys("amar");
		
	}

}