package PIIT_.Trainingsession;
import java.util.*;  
public class Input {  
		public static void main(String[] args)  
		{ 
			input();
	}
		public static String input() {
			Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
			System.out.print("Enter a Browser: ");  
			String str= sc.nextLine();              //reads string  
			System.out.print("You have entered: "+str);  
			return str;
			
		}
}
