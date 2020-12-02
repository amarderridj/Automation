package RUN;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import Codetostart.TestNGUsability;
import Pages.Facebook.CreateNewAccount;
import Pages.Facebook.Home;

public class Shots extends TestNGUsability{
  @Test
  public void pass1() throws InterruptedException {
	  System.out.println("this is our @Test annotation");
	  Home obj=new Home(driver);
	  Thread.sleep(3000);
	  obj.emailinput("amar.derridj@gmail.com");
	  obj.passinput("123456");
	
  }
  @Test
  public void pass2() {
	  Home newacc=new Home(driver);
	  newacc.accin();
	  CreateNewAccount SignUp=new CreateNewAccount(driver);
	  SignUp.mminput();
	  SignUp.ddinput();
	  SignUp.yyinput();
	  
  }
  @Test
  public void fail1() {
	  driver.findElement(By.name("amar")).click();
	  
  }
  @Test
  public void fail2() {
	  driver.findElement(By.id("1")).click();
	  
  }
  
}
