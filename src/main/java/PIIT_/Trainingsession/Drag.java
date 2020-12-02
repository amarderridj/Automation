package PIIT_.Trainingsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/home/kali/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable");
		driver.manage().window().maximize();
		
		Actions it =new Actions(driver);
		driver.switchTo().frame(0);
		WebElement sr = driver.findElement(By.id("draggable"));
		WebElement dr = driver.findElement(By.id("droppable"));
		it.dragAndDrop(sr, dr).build().perform();

	}

}
