package RUN;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Logges {
public static Logger lg=Logger.getLogger(Logges.class.getName());
	public static void main(String[] args) {
		
		PropertyConfigurator.configure("/home/kali/eclipse-workspace/Trainingsession/Logged.properties/");
		
	}

}
