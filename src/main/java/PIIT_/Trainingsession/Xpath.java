package PIIT_.Trainingsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/home/kali/Downloads/chromedriver");
		  
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		//this is our Absolute Xpath
        //WebElement signbt=driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/div/form/div/button")); 
		//signbt.click();
		
	    //this is our relative Xpath
		WebElement email=driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']"));
		email.sendKeys("amar.derridj@gmail.com");	
		
		WebElement newAcc=driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
		newAcc.click();
		
		//convert the Element Sign UP to a text
		WebElement signup=driver.findElement(By.xpath("(//*[text()='Sign Up'])[3]"));
		signup.click();

	}

}
