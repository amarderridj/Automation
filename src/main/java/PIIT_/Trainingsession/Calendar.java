package PIIT_.Trainingsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "/home/kali/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.qatarairways.com/en-us/homepage.html");
		driver.manage().window().maximize();
		//Thread.sleep(6000);
		driver.findElement(By.id("cookie-close")).click();
		driver.findElement(By.id("T7-departure_1")).click();
		//driver.findElement(By.xpath("(//*[text()='26'])[2]")).click();
		driver.findElement(By.xpath("(//td[@class='available'])[6]")).click();
		
		

	}

}
