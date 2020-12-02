package PIIT_.Trainingsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popups {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/home/kali/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("submit")).click();
		//driver.switchTo().alert().accept();
		//driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();

	}

}
