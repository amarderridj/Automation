package PIIT_.Trainingsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/home/kali/Downloads/chromedriver");
	  
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		WebElement name=driver.findElement(By.name("email"));
		WebElement passwd=driver.findElement(By.name("pass"));
		//WebElement sign=driver.findElement(By.name("login"));
		
		
		
		WebElement signbt=driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/div/form/div/button")); 
		
	
		
		
		name.sendKeys("amar.derridj@gmail.com");
		passwd.sendKeys("amar");
		signbt.click();
		
		//sign.click();
		
		

	}

}
