package RUN;

import org.testng.annotations.Test;

import Codetostart.TestNGUsability;
import Pages.Facebook.Home;

import org.testng.annotations.DataProvider;

public class Provider extends TestNGUsability{
	
	
  @Test(dataProvider = "DP")
  public void f(String n, String s) throws InterruptedException {
	  Home objet=new Home(driver);
	  Thread.sleep(3000);
	  objet.emailinput(n);
	  objet.passinput(s);
	  //Thread.sleep(3000);
	  objet.signin();
	  
  }

  @DataProvider(name ="DP")
  public Object[][] dp_method() {
    return new Object[][] { {"amar.derridj@gmail.com", "123456"},{"dev.derridj@gmail.com", "123456" },
    						 {"arezki.derridj@gmail.com", "123456" } };
    						
    
  
  }
  }
