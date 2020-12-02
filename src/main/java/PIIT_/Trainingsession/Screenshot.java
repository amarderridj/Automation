package PIIT_.Trainingsession;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	static WebDriver driver;
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/kali/Downloads/chromedriver");
	driver = new ChromeDriver();
		driver.get("https://www.qatarairways.com/en-us/homepage.html");
		driver.manage().window().maximize();
		//declare the implicit wait
		driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
		
		Thread.sleep(6000);
		driver.findElement(By.id("cookie-close")).click();
		picture();
		Thread.sleep(6000);
		driver.findElement(By.id("T7-departure_1")).click();
		picture();
		//driver.findElement(By.xpath("(//*[text()='26'])[2]")).click();
		driver.findElement(By.xpath("(//td[@class='available'])[6]")).click();
		picture();
		//File shots = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//FileHandler.copy(shots, new File ("/home/kali/eclipse-workspace/Trainingsession/Screenshots/Airline1.png"));
		
	}
	public static void picture () throws IOException {
		Date dt=new Date();
		System.out.println(dt);
		String st =dt.toString().replace(" ", "_").replace(" ", "_");
		System.out.println(st);
		File shots = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(shots, new File ("/home/kali/eclipse-workspace/Trainingsession/Screenshots/"+st+".png"));
	}

}
