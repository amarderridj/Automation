package RUN;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Codetostart.TestNGUsability;
import Pages.Facebook.Forgot_Password;
import Pages.Facebook.Home;

public class TestNG extends TestNGUsability{

 @Test(priority = 2, dependsOnMethods = "Passwordfield")
  public void f() {
	  //Open facebook account and verify the login function
	 
	  Home objet=new Home(driver);
	  objet.emailinput("amar.derridj@gmail.com");
	  objet.passinput("123456");
	  objet.accin();
  }
  @Test(priority = 1)
  public void Passwordfield() {
	  //Goto facebook and verify the forgot password
	  Home ob =new Home(driver);
	  ob.Forgotlink();
	  Forgot_Password ob2 =new Forgot_Password(driver);
	  
	  String gettext= ob2.textout().getText();
	  SoftAssert ass=new SoftAssert();
	  System.out.println(gettext);
	  ass.assertEquals(gettext, "Find Your Account**");	
	  
	  ob2.forgotfieldinput("amar.derridj@gmail.com");
	  ob2.searchfieldinput();
	 
	  ass.assertAll();
  }}
  
 /* @BeforeClass
  public void beforeClass() {
	  String get=Input.input();
	
	  Driver(get, "https://www.facebook.com");
  
  }*/
  
  
  
  

 /* @AfterClass
  public void afterClass() {
	 // driver.close();
  }
  		public void Driver(String browser, String URL) {
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "/home/kali/Downloads/chromedriver");
		    driver = new ChromeDriver();
			driver.get(URL);
			driver.manage().window().maximize();
			WebElement CreateAnaccount = driver.findElement(By.linkText("Create New Account"));
			boolean acc = CreateAnaccount.isDisplayed();
			System.out.println(acc);
			WebElement text=driver.findElement(By.xpath("//h2[contains(text(),'Connect with friends and the world around you on F')]"));
			String textheading=text.getText();
			System.out.println(textheading);
		}else if (browser.equalsIgnoreCase("Firefox")){
			System.setProperty("webdriver.gecko.driver", "/home/kali/eclipse-workspace/Trainingsession/Drivers/geckodriver");
		    driver = new FirefoxDriver();
			driver.get(URL);
			driver.manage().window().maximize();
			WebElement CreateAnaccount = driver.findElement(By.linkText("Create New Account"));
			boolean acc = CreateAnaccount.isDisplayed();
			System.out.println(acc);
			WebElement text=driver.findElement(By.xpath("//h2[contains(text(),'Connect with friends and the world around you on F')]"));
			
			String textheading=text.getText();
			System.out.println(textheading);
		}
  		}*/
  		
