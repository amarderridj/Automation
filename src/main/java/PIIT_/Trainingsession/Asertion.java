package PIIT_.Trainingsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

		
public class Asertion {
	static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/home/kali/Downloads/chromedriver");
	    driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		WebElement CreateAnaccount = driver.findElement(By.linkText("Create New Account"));
		boolean acc = CreateAnaccount.isDisplayed();
		System.out.println(acc);
		WebElement text=driver.findElement(By.xpath("//h2[contains(text(),'Connect with friends and the world around you on F')]"));
		
		String textheading=text.getText();
		System.out.println(textheading);
		

	}

}
