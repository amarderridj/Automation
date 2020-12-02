package PIIT_.Trainingsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolute_Relative_XPath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/kali/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
	
		
		//this is the Absolute XPath
		WebElement email=driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/div/form/div/div/input"));
		email.sendKeys("amar.derridj@gmail.com");
		
		
		//this is the Relative XPath
		
		driver.findElement(By.xpath("//input[@data-testid='royal_pass']")).sendKeys("123456789");
		
		//WebElement login = driver.findElement(By.xpath("//*[contains(@name,'log')][2]"));
		//login.click();
		
		Thread.sleep(6000);
		driver.findElement(By.id("u_0_2")).click();
		//acc.click();
		
		driver.findElement(By.xpath("//input[@id='u_1_b']")).sendKeys("amar");
		
		Thread.sleep(6000);
		WebElement signup = driver.findElement(By.xpath("//*[@id='u_1_s']"));
		signup.click();
		
	}

}
