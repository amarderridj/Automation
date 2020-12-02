package PIIT_.Trainingsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/home/kali/Downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		WebElement email= driver.findElement(By.id("email"));
		WebElement passwd=driver.findElement(By.id("pass"));
		WebElement login=driver.findElement(By.id("u_0_b"));
		email.sendKeys("amar.derridj@gmail.com");
		passwd.sendKeys("amar");
		login.click();
		
		

	}

}
