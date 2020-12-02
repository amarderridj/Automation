package RUN;


import org.testng.annotations.Test;

import Codetostart.TestNGUsability;
import Pages.Facebook.CreateNewAccount;
import Pages.Facebook.Home;


public class TestNG_Class extends TestNGUsability{
	
  @Test (priority = 1,dependsOnMethods = "g")
  public void f() throws InterruptedException {
	 System.out.println("this is our @Test annotation");
	  Home obj=new Home(driver);
	  Thread.sleep(3000);
	  obj.emailinput("amar.derridj@gmail.com");
	  obj.passinput("123456");
	
	  
  }
  
 @Test(priority = 2, dependsOnMethods = "g")
  public void newAccount() {
	  Home newacc=new Home(driver);
	  newacc.accin();
	  CreateNewAccount SignUp=new CreateNewAccount(driver);
	  SignUp.mminput();
	  SignUp.ddinput();
	  SignUp.yyinput();
  }
  
  @Test(priority=3)
  public void g() {
	  System.out.println("g");
  }
  
	 
  /*@BeforeClass
	  public void beforeClass() {
		  String get=Input.input();
		
		  Driver(get, "https://www.facebook.com");
	  
	   }   */
  
  
  /*@BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", "/home/kali/Downloads/chromedriver");
	  driver=new ChromeDriver();
	  driver.get("https://www.facebook.com");
	  driver.manage().window().maximize();
  }
  @AfterClass
  public void afterClass() {
  driver.close();
	}
	*/
}

