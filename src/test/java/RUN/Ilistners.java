package RUN;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import Codetostart.TestNGUsability;

public class Ilistners extends TestNGUsability implements ITestListener{

	

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Automation passed");
		    this.driver = ((TestNGUsability)result.getInstance()).driver;
			Date dt=new Date();
			System.out.println(dt);
			String st =dt.toString().replace(" ", "_").replace(" ", "_");
			System.out.println(st);
			File shots = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			try {
				FileHandler.copy(shots, new File ("/home/kali/eclipse-workspace/Trainingsession/Screenshots/Pass/"+st+".png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}

	@Override
	public void onFinish(ITestContext result) {
		System.out.println("Automation is finished");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Automation failed");
		
		this.driver = ((TestNGUsability)result.getInstance()).driver;
		Date dt=new Date();
		System.out.println(dt);
		String st =dt.toString().replace(" ", "_").replace(" ", "_");
		System.out.println(st);
		File shots = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileHandler.copy(shots, new File ("/home/kali/eclipse-workspace/Trainingsession/Screenshots/Fail/"+st+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("Automation is started");
	}

}
