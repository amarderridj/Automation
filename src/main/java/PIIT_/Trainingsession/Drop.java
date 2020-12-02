package PIIT_.Trainingsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import org.openqa.selenium.Support.ui.Select;

public class Drop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/home/kali/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("(\"//*[text()='Create New Account']")).click();
		
		WebElement birth = driver.findElement(By.name("birthday_day"));
		
		
		
		/*Select ob=new Select(birth);
		
		ob.Selectbyvalue("5");
		
		WebElement day = driver.findElement(By.name("birthday_month"));
		//Select obday=new Select(day);
		obday.Selectbyvalue("19");
		
		WebElement year= driver.findElement(By.name("birthday_year"));
		Select obyear=new Select(year);
		obyear.Selectbyvalue("1992");*/
;		
	    
	}

}
